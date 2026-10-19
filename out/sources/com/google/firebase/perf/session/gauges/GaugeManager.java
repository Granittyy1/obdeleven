package com.google.firebase.perf.session.gauges;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.media3.exoplayer.O;
import androidx.media3.exoplayer.X;
import com.facebook.login.RunnableC1769a;
import com.google.firebase.messaging.RunnableC2057u;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.h;
import com.google.firebase.perf.util.i;
import com.google.firebase.perf.v1.ApplicationProcessState;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p218r7.a;
import p218r7.m;
import p218r7.o;
import p218r7.p;
import p228s6.l;
import p314z7.f;
import y7.b;
import y7.c;
import y7.d;
import y7.e;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private ApplicationProcessState applicationProcessState;
    private final a configResolver;
    private final l<y7.a> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final l<ScheduledExecutorService> gaugeManagerExecutor;
    private d gaugeMetadataManager;
    private final l<e> memoryGaugeCollector;
    private String sessionId;
    private final f transportManager;
    private static final p241t7.a logger = p241t7.a.d();
    private static final GaugeManager instance = new GaugeManager();

    private GaugeManager() {
        this(new l(new b()), f.f48930t, a.e(), null, new l(new p228s6.e(1)), new l(new c()));
    }

    private static void collectGaugeMetricOnce(y7.a aVar, e eVar, h hVar) {
        synchronized (aVar) {
            try {
                aVar.f48413b.schedule(new O(aVar, 3, hVar), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                p241t7.a aVar2 = y7.a.f48410g;
                e10.getMessage();
                aVar2.f();
            }
        }
        synchronized (eVar) {
            try {
                eVar.f48422a.schedule(new RunnableC2057u(eVar, 3, hVar), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e11) {
                p241t7.a aVar3 = e.f48421f;
                e11.getMessage();
                aVar3.f();
            }
        }
    }

    private long getCpuGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
        m mVar;
        long jLongValue;
        p218r7.l lVar;
        int iOrdinal = applicationProcessState.ordinal();
        if (iOrdinal == 1) {
            a aVar = this.configResolver;
            aVar.getClass();
            synchronized (m.class) {
                try {
                    if (m.f46376c == null) {
                        m.f46376c = new m();
                    }
                    mVar = m.f46376c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            com.google.firebase.perf.util.d<Long> dVarJ = aVar.j(mVar);
            if (dVarJ.b() && a.n(dVarJ.a().longValue())) {
                jLongValue = dVarJ.a().longValue();
            } else {
                com.google.firebase.perf.util.d<Long> dVar = aVar.f46362a.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (dVar.b() && a.n(dVar.a().longValue())) {
                    aVar.f46364c.d(dVar.a().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    jLongValue = dVar.a().longValue();
                } else {
                    com.google.firebase.perf.util.d<Long> dVarC = aVar.c(mVar);
                    if (dVarC.b() && a.n(dVarC.a().longValue())) {
                        jLongValue = dVarC.a().longValue();
                    } else {
                        jLongValue = aVar.f46362a.isLastFetchFailed() ? 300L : 100L;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            jLongValue = -1;
        } else {
            a aVar2 = this.configResolver;
            aVar2.getClass();
            synchronized (p218r7.l.class) {
                try {
                    if (p218r7.l.f46375c == null) {
                        p218r7.l.f46375c = new p218r7.l();
                    }
                    lVar = p218r7.l.f46375c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            com.google.firebase.perf.util.d<Long> dVarJ2 = aVar2.j(lVar);
            if (dVarJ2.b() && a.n(dVarJ2.a().longValue())) {
                jLongValue = dVarJ2.a().longValue();
            } else {
                com.google.firebase.perf.util.d<Long> dVar2 = aVar2.f46362a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
                if (dVar2.b() && a.n(dVar2.a().longValue())) {
                    aVar2.f46364c.d(dVar2.a().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                    jLongValue = dVar2.a().longValue();
                } else {
                    com.google.firebase.perf.util.d<Long> dVarC2 = aVar2.c(lVar);
                    jLongValue = (dVarC2.b() && a.n(dVarC2.a().longValue())) ? dVarC2.a().longValue() : 0L;
                }
            }
        }
        p241t7.a aVar3 = y7.a.f48410g;
        return jLongValue <= 0 ? INVALID_GAUGE_COLLECTION_FREQUENCY : jLongValue;
    }

    private com.google.firebase.perf.v1.e getGaugeMetadata() {
        com.google.firebase.perf.v1.e.a aVarM = com.google.firebase.perf.v1.e.M();
        d dVar = this.gaugeMetadataManager;
        StorageUnit storageUnit = StorageUnit.f28488d;
        int iB = i.b(storageUnit.a(dVar.f48420c.totalMem));
        aVarM.r();
        com.google.firebase.perf.v1.e.J((com.google.firebase.perf.v1.e) aVarM.f29047c, iB);
        int iB2 = i.b(storageUnit.a(this.gaugeMetadataManager.f48418a.maxMemory()));
        aVarM.r();
        com.google.firebase.perf.v1.e.H((com.google.firebase.perf.v1.e) aVarM.f29047c, iB2);
        int iB3 = i.b(StorageUnit.f28486b.a(this.gaugeMetadataManager.f48419b.getMemoryClass()));
        aVarM.r();
        com.google.firebase.perf.v1.e.I((com.google.firebase.perf.v1.e) aVarM.f29047c, iB3);
        return aVarM.p();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
        p pVar;
        long jLongValue;
        o oVar;
        int iOrdinal = applicationProcessState.ordinal();
        if (iOrdinal == 1) {
            a aVar = this.configResolver;
            aVar.getClass();
            synchronized (p.class) {
                try {
                    if (p.f46379c == null) {
                        p.f46379c = new p();
                    }
                    pVar = p.f46379c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            com.google.firebase.perf.util.d<Long> dVarJ = aVar.j(pVar);
            if (dVarJ.b() && a.n(dVarJ.a().longValue())) {
                jLongValue = dVarJ.a().longValue();
            } else {
                com.google.firebase.perf.util.d<Long> dVar = aVar.f46362a.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (dVar.b() && a.n(dVar.a().longValue())) {
                    aVar.f46364c.d(dVar.a().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    jLongValue = dVar.a().longValue();
                } else {
                    com.google.firebase.perf.util.d<Long> dVarC = aVar.c(pVar);
                    if (dVarC.b() && a.n(dVarC.a().longValue())) {
                        jLongValue = dVarC.a().longValue();
                    } else {
                        jLongValue = aVar.f46362a.isLastFetchFailed() ? 300L : 100L;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            jLongValue = -1;
        } else {
            a aVar2 = this.configResolver;
            aVar2.getClass();
            synchronized (o.class) {
                try {
                    if (o.f46378c == null) {
                        o.f46378c = new o();
                    }
                    oVar = o.f46378c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            com.google.firebase.perf.util.d<Long> dVarJ2 = aVar2.j(oVar);
            if (dVarJ2.b() && a.n(dVarJ2.a().longValue())) {
                jLongValue = dVarJ2.a().longValue();
            } else {
                com.google.firebase.perf.util.d<Long> dVar2 = aVar2.f46362a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
                if (dVar2.b() && a.n(dVar2.a().longValue())) {
                    aVar2.f46364c.d(dVar2.a().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                    jLongValue = dVar2.a().longValue();
                } else {
                    com.google.firebase.perf.util.d<Long> dVarC2 = aVar2.c(oVar);
                    jLongValue = (dVarC2.b() && a.n(dVarC2.a().longValue())) ? dVarC2.a().longValue() : 0L;
                }
            }
        }
        p241t7.a aVar3 = e.f48421f;
        return jLongValue <= 0 ? INVALID_GAUGE_COLLECTION_FREQUENCY : jLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y7.a lambda$new$0() {
        return new y7.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$new$1() {
        return new e();
    }

    private boolean startCollectingCpuMetrics(long j, h hVar) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a();
            return false;
        }
        y7.a aVar = this.cpuGaugeCollector.get();
        long j10 = aVar.f48415d;
        if (j10 == INVALID_GAUGE_COLLECTION_FREQUENCY || j10 == 0 || j <= 0) {
            return true;
        }
        ScheduledFuture scheduledFuture = aVar.f48416e;
        if (scheduledFuture == null) {
            aVar.a(j, hVar);
            return true;
        }
        if (aVar.f48417f == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            aVar.f48416e = null;
            aVar.f48417f = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        aVar.a(j, hVar);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, h hVar) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a();
            return false;
        }
        e eVar = this.memoryGaugeCollector.get();
        p241t7.a aVar = e.f48421f;
        if (j <= 0) {
            eVar.getClass();
            return true;
        }
        ScheduledFuture scheduledFuture = eVar.f48425d;
        if (scheduledFuture == null) {
            eVar.a(j, hVar);
            return true;
        }
        if (eVar.f48426e == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            eVar.f48425d = null;
            eVar.f48426e = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        eVar.a(j, hVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, ApplicationProcessState applicationProcessState) {
        com.google.firebase.perf.v1.f.a aVarR = com.google.firebase.perf.v1.f.R();
        while (!this.cpuGaugeCollector.get().f48412a.isEmpty()) {
            com.google.firebase.perf.v1.d dVarPoll = this.cpuGaugeCollector.get().f48412a.poll();
            aVarR.r();
            com.google.firebase.perf.v1.f.K((com.google.firebase.perf.v1.f) aVarR.f29047c, dVarPoll);
        }
        while (!this.memoryGaugeCollector.get().f48423b.isEmpty()) {
            com.google.firebase.perf.v1.b bVarPoll = this.memoryGaugeCollector.get().f48423b.poll();
            aVarR.r();
            com.google.firebase.perf.v1.f.I((com.google.firebase.perf.v1.f) aVarR.f29047c, bVarPoll);
        }
        aVarR.r();
        com.google.firebase.perf.v1.f.H((com.google.firebase.perf.v1.f) aVarR.f29047c, str);
        f fVar = this.transportManager;
        fVar.j.execute(new p314z7.d(fVar, aVarR.p(), applicationProcessState));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new d(context);
    }

    public boolean logGaugeMetadata(String str, ApplicationProcessState applicationProcessState) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        com.google.firebase.perf.v1.f.a aVarR = com.google.firebase.perf.v1.f.R();
        aVarR.r();
        com.google.firebase.perf.v1.f.H((com.google.firebase.perf.v1.f) aVarR.f29047c, str);
        com.google.firebase.perf.v1.e gaugeMetadata = getGaugeMetadata();
        aVarR.r();
        com.google.firebase.perf.v1.f.J((com.google.firebase.perf.v1.f) aVarR.f29047c, gaugeMetadata);
        com.google.firebase.perf.v1.f fVarP = aVarR.p();
        f fVar = this.transportManager;
        fVar.j.execute(new p314z7.d(fVar, fVarP, applicationProcessState));
        return true;
    }

    public void startCollectingGauges(p290x7.a aVar, ApplicationProcessState applicationProcessState) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(applicationProcessState, aVar.f47911c);
        if (jStartCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.f();
            return;
        }
        String str = aVar.f47910b;
        this.sessionId = str;
        this.applicationProcessState = applicationProcessState;
        try {
            long j = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new X(this, str, applicationProcessState, 1), j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            p241t7.a aVar2 = logger;
            e10.getMessage();
            aVar2.f();
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        ApplicationProcessState applicationProcessState = this.applicationProcessState;
        y7.a aVar = this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture = aVar.f48416e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            aVar.f48416e = null;
            aVar.f48417f = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        e eVar = this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture2 = eVar.f48425d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            eVar.f48425d = null;
            eVar.f48426e = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new RunnableC1769a(this, str, applicationProcessState, 1), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public GaugeManager(l<ScheduledExecutorService> lVar, f fVar, a aVar, d dVar, l<y7.a> lVar2, l<e> lVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = lVar;
        this.transportManager = fVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = dVar;
        this.cpuGaugeCollector = lVar2;
        this.memoryGaugeCollector = lVar3;
    }

    private long startCollectingGauges(ApplicationProcessState applicationProcessState, h hVar) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(applicationProcessState);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, hVar)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(applicationProcessState);
        if (startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, hVar)) {
            return cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
        }
        return cpuGaugeCollectionFrequencyMs;
    }

    public void collectGaugeMetricOnce(h hVar) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), hVar);
    }
}
