package com.google.firebase.perf.session;

import D7.j;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.ApplicationProcessState;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p206q7.a;
import p206q7.b;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class SessionManager extends b {
    private static final SessionManager instance = new SessionManager();
    private final a appStateMonitor;
    private final Set<WeakReference<p290x7.b>> clients;
    private final GaugeManager gaugeManager;
    private p290x7.a perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), p290x7.a.c(UUID.randomUUID().toString()), a.a());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, p290x7.a aVar) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (aVar.f47912d) {
            this.gaugeManager.logGaugeMetadata(aVar.f47910b, ApplicationProcessState.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(ApplicationProcessState applicationProcessState) {
        p290x7.a aVar = this.perfSession;
        if (aVar.f47912d) {
            this.gaugeManager.logGaugeMetadata(aVar.f47910b, applicationProcessState);
        }
    }

    private void startOrStopCollectingGauges(ApplicationProcessState applicationProcessState) {
        p290x7.a aVar = this.perfSession;
        if (aVar.f47912d) {
            this.gaugeManager.startCollectingGauges(aVar, applicationProcessState);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    @VisibleForTesting
    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        ApplicationProcessState applicationProcessState = ApplicationProcessState.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(applicationProcessState);
        startOrStopCollectingGauges(applicationProcessState);
    }

    @Override // p206q7.b, q7.a.b
    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        super.onUpdateAppState(applicationProcessState);
        if (this.appStateMonitor.f46162r) {
            return;
        }
        if (applicationProcessState == ApplicationProcessState.FOREGROUND) {
            updatePerfSession(p290x7.a.c(UUID.randomUUID().toString()));
        } else if (this.perfSession.d()) {
            updatePerfSession(p290x7.a.c(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(applicationProcessState);
        }
    }

    public final p290x7.a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<p290x7.b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new j(this, context, this.perfSession, 2));
    }

    @VisibleForTesting
    public void setPerfSession(p290x7.a aVar) {
        this.perfSession = aVar;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.d()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<p290x7.b> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(p290x7.a aVar) {
        if (aVar.f47910b == this.perfSession.f47910b) {
            return;
        }
        this.perfSession = aVar;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<p290x7.b>> it = this.clients.iterator();
                while (it.hasNext()) {
                    p290x7.b bVar = it.next().get();
                    if (bVar != null) {
                        bVar.a(aVar);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.f46160p);
        startOrStopCollectingGauges(this.appStateMonitor.f46160p);
    }

    @VisibleForTesting
    public SessionManager(GaugeManager gaugeManager, p290x7.a aVar, a aVar2) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = aVar;
        this.appStateMonitor = aVar2;
        registerForAppState();
    }
}
