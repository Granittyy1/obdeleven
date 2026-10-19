package com.voltasit.obdeleven.data.providers;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.internal.measurement.C1787c0;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.integrity.internal.aq;
import com.voltasit.obdeleven.domain.exceptions.IntegrityException;
import com.voltasit.obdeleven.domain.models.integrity.IntegrityTokenType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.G0;
import kotlinx.coroutines.sync.MutexImpl;
import p191p5.B;

/* JADX INFO: compiled from: PlayIntegrityProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PlayIntegrityProvider implements J8.m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f30218i;
    public static final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f30219k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f30220l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.p f30222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Pa.e f30223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p019b6.a f30224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutexImpl f30225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile b6.a.c f30226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile long f30227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Pa.a f30228h;

    /* JADX INFO: compiled from: PlayIntegrityProvider.kt */
    public static final class a implements p191p5.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2693i f30229b;

        public a(C2693i c2693i) {
            this.f30229b = c2693i;
        }

        @Override // p191p5.d
        public final void d(Exception exc) {
            this.f30229b.resumeWith(kotlin.b.a(exc));
        }
    }

    /* JADX INFO: compiled from: PlayIntegrityProvider.kt */
    public static final class b implements p191p5.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2693i f30230b;

        public b(C2693i c2693i) {
            this.f30230b = c2693i;
        }

        @Override // p191p5.d
        public final void d(Exception exc) {
            this.f30230b.resumeWith(kotlin.b.a(exc));
        }
    }

    /* JADX INFO: compiled from: PlayIntegrityProvider.kt */
    public static final class c implements p191p5.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lambda f30231b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Ia.l lVar) {
            this.f30231b = (Lambda) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // p191p5.e
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f30231b.invoke(obj);
        }
    }

    static {
        int i10 = Pa.b.f4973e;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        f30218i = C1787c0.t(10, durationUnit);
        j = C1787c0.t(30, durationUnit);
        f30219k = C1787c0.t(15, DurationUnit.MINUTES);
    }

    public PlayIntegrityProvider(Context context, long j10, J8.p pVar) {
        androidx.compose.runtime.snapshots.j jVar;
        Pa.e.a aVar = Pa.e.a.f4978a;
        this.f30221a = j10;
        this.f30222b = pVar;
        this.f30223c = aVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (p019b6.d.class) {
            try {
                if (p019b6.d.f20562a == null) {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    p019b6.d.f20562a = new androidx.compose.runtime.snapshots.j(applicationContext2 != null ? applicationContext2 : applicationContext);
                }
                jVar = p019b6.d.f20562a;
            } catch (Throwable th) {
                throw th;
            }
        }
        p019b6.a aVar2 = (p019b6.a) ((com.google.android.play.integrity.internal.i) jVar.f13215b).a();
        kotlin.jvm.internal.i.d(aVar2, "createStandard(...)");
        this.f30224d = aVar2;
        this.f30225e = kotlinx.coroutines.sync.b.a();
        int i10 = Pa.b.f4973e;
        this.f30227g = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(PlayIntegrityProvider playIntegrityProvider, b6.a.d dVar, ContinuationImpl continuationImpl) throws Throwable {
        PlayIntegrityProvider$fetchTokenWithRetry$1 playIntegrityProvider$fetchTokenWithRetry$1;
        b6.a.c cVar;
        PlayIntegrityProvider playIntegrityProvider2;
        b6.a.d dVar2;
        String str;
        b6.a.d dVar3;
        PlayIntegrityProvider playIntegrityProvider3;
        playIntegrityProvider.getClass();
        if (continuationImpl instanceof PlayIntegrityProvider$fetchTokenWithRetry$1) {
            playIntegrityProvider$fetchTokenWithRetry$1 = (PlayIntegrityProvider$fetchTokenWithRetry$1) continuationImpl;
            int i10 = playIntegrityProvider$fetchTokenWithRetry$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                playIntegrityProvider$fetchTokenWithRetry$1.label = i10 - Integer.MIN_VALUE;
            } else {
                playIntegrityProvider$fetchTokenWithRetry$1 = new PlayIntegrityProvider$fetchTokenWithRetry$1(playIntegrityProvider, continuationImpl);
            }
        } else {
            playIntegrityProvider$fetchTokenWithRetry$1 = new PlayIntegrityProvider$fetchTokenWithRetry$1(playIntegrityProvider, continuationImpl);
        }
        Object objE = playIntegrityProvider$fetchTokenWithRetry$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = playIntegrityProvider$fetchTokenWithRetry$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(objE);
                playIntegrityProvider$fetchTokenWithRetry$1.L$0 = playIntegrityProvider;
                playIntegrityProvider$fetchTokenWithRetry$1.L$1 = dVar;
                playIntegrityProvider$fetchTokenWithRetry$1.label = 1;
                objE = playIntegrityProvider.e(playIntegrityProvider$fetchTokenWithRetry$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    if (i11 == 2) {
                        dVar2 = (b6.a.d) playIntegrityProvider$fetchTokenWithRetry$1.L$1;
                        playIntegrityProvider2 = (PlayIntegrityProvider) playIntegrityProvider$fetchTokenWithRetry$1.L$0;
                        try {
                            kotlin.b.b(objE);
                            str = (String) objE;
                        } catch (StandardIntegrityException e10) {
                            e = e10;
                            if (e.b() == -19) {
                                throw e;
                            }
                            playIntegrityProvider$fetchTokenWithRetry$1.L$0 = playIntegrityProvider2;
                            playIntegrityProvider$fetchTokenWithRetry$1.L$1 = dVar2;
                            playIntegrityProvider$fetchTokenWithRetry$1.label = 3;
                            if (playIntegrityProvider2.g(playIntegrityProvider$fetchTokenWithRetry$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            PlayIntegrityProvider playIntegrityProvider4 = playIntegrityProvider2;
                            dVar3 = dVar2;
                            playIntegrityProvider3 = playIntegrityProvider4;
                            playIntegrityProvider$fetchTokenWithRetry$1.L$0 = dVar3;
                            playIntegrityProvider$fetchTokenWithRetry$1.L$1 = playIntegrityProvider3;
                            playIntegrityProvider$fetchTokenWithRetry$1.label = 4;
                            objE = playIntegrityProvider3.e(playIntegrityProvider$fetchTokenWithRetry$1);
                            if (objE == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            playIntegrityProvider$fetchTokenWithRetry$1.L$0 = null;
                            playIntegrityProvider$fetchTokenWithRetry$1.L$1 = null;
                            playIntegrityProvider$fetchTokenWithRetry$1.label = 5;
                            playIntegrityProvider3.getClass();
                            objE = d((b6.a.c) objE, dVar3, playIntegrityProvider$fetchTokenWithRetry$1);
                            if (objE == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            str = (String) objE;
                        }
                        return str;
                    }
                    if (i11 == 3) {
                        dVar2 = (b6.a.d) playIntegrityProvider$fetchTokenWithRetry$1.L$1;
                        playIntegrityProvider2 = (PlayIntegrityProvider) playIntegrityProvider$fetchTokenWithRetry$1.L$0;
                        kotlin.b.b(objE);
                        PlayIntegrityProvider playIntegrityProvider5 = playIntegrityProvider2;
                        dVar3 = dVar2;
                        playIntegrityProvider3 = playIntegrityProvider5;
                        playIntegrityProvider$fetchTokenWithRetry$1.L$0 = dVar3;
                        playIntegrityProvider$fetchTokenWithRetry$1.L$1 = playIntegrityProvider3;
                        playIntegrityProvider$fetchTokenWithRetry$1.label = 4;
                        objE = playIntegrityProvider3.e(playIntegrityProvider$fetchTokenWithRetry$1);
                        if (objE == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        playIntegrityProvider$fetchTokenWithRetry$1.L$0 = null;
                        playIntegrityProvider$fetchTokenWithRetry$1.L$1 = null;
                        playIntegrityProvider$fetchTokenWithRetry$1.label = 5;
                        playIntegrityProvider3.getClass();
                        objE = d((b6.a.c) objE, dVar3, playIntegrityProvider$fetchTokenWithRetry$1);
                        if (objE == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (i11 == 4) {
                        playIntegrityProvider3 = (PlayIntegrityProvider) playIntegrityProvider$fetchTokenWithRetry$1.L$1;
                        dVar3 = (b6.a.d) playIntegrityProvider$fetchTokenWithRetry$1.L$0;
                        kotlin.b.b(objE);
                        playIntegrityProvider$fetchTokenWithRetry$1.L$0 = null;
                        playIntegrityProvider$fetchTokenWithRetry$1.L$1 = null;
                        playIntegrityProvider$fetchTokenWithRetry$1.label = 5;
                        playIntegrityProvider3.getClass();
                        objE = d((b6.a.c) objE, dVar3, playIntegrityProvider$fetchTokenWithRetry$1);
                        if (objE == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i11 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(objE);
                    }
                    str = (String) objE;
                    return str;
                }
                dVar = (b6.a.d) playIntegrityProvider$fetchTokenWithRetry$1.L$1;
                playIntegrityProvider = (PlayIntegrityProvider) playIntegrityProvider$fetchTokenWithRetry$1.L$0;
                kotlin.b.b(objE);
            }
            playIntegrityProvider$fetchTokenWithRetry$1.L$0 = playIntegrityProvider;
            playIntegrityProvider$fetchTokenWithRetry$1.L$1 = dVar;
            playIntegrityProvider$fetchTokenWithRetry$1.label = 2;
            playIntegrityProvider.getClass();
            objE = d(cVar, dVar, playIntegrityProvider$fetchTokenWithRetry$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
            b6.a.d dVar4 = dVar;
            playIntegrityProvider2 = playIntegrityProvider;
            dVar2 = dVar4;
            str = (String) objE;
            return str;
        } catch (StandardIntegrityException e11) {
            e = e11;
            b6.a.d dVar5 = dVar;
            playIntegrityProvider2 = playIntegrityProvider;
            dVar2 = dVar5;
            if (e.b() == -19) {
                throw e;
            }
            playIntegrityProvider$fetchTokenWithRetry$1.L$0 = playIntegrityProvider2;
            playIntegrityProvider$fetchTokenWithRetry$1.L$1 = dVar2;
            playIntegrityProvider$fetchTokenWithRetry$1.label = 3;
            if (playIntegrityProvider2.g(playIntegrityProvider$fetchTokenWithRetry$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            PlayIntegrityProvider playIntegrityProvider6 = playIntegrityProvider2;
            dVar3 = dVar2;
            playIntegrityProvider3 = playIntegrityProvider6;
            playIntegrityProvider$fetchTokenWithRetry$1.L$0 = dVar3;
            playIntegrityProvider$fetchTokenWithRetry$1.L$1 = playIntegrityProvider3;
            playIntegrityProvider$fetchTokenWithRetry$1.label = 4;
            objE = playIntegrityProvider3.e(playIntegrityProvider$fetchTokenWithRetry$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
            playIntegrityProvider$fetchTokenWithRetry$1.L$0 = null;
            playIntegrityProvider$fetchTokenWithRetry$1.L$1 = null;
            playIntegrityProvider$fetchTokenWithRetry$1.label = 5;
            playIntegrityProvider3.getClass();
            objE = d((b6.a.c) objE, dVar3, playIntegrityProvider$fetchTokenWithRetry$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = (String) objE;
        }
        cVar = (b6.a.c) objE;
    }

    public static Object d(b6.a.c cVar, b6.a.d dVar, kotlin.coroutines.c cVar2) {
        final C2693i c2693i = new C2693i(1, A8.p.y(cVar2));
        c2693i.s();
        B bA = cVar.a(dVar);
        c cVar3 = new c(new Ia.l<b6.a.b, p293xa.r>() { // from class: com.voltasit.obdeleven.data.providers.PlayIntegrityProvider$awaitToken$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(b6.a.b bVar) {
                c2693i.resumeWith(bVar.a());
                return p293xa.r.f47939a;
            }
        });
        bA.getClass();
        bA.f(p191p5.i.f45812a, cVar3);
        bA.r(new a(c2693i));
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // J8.m
    public final Object a(ContinuationImpl continuationImpl) {
        PlayIntegrityProvider$warmUp$1 playIntegrityProvider$warmUp$1;
        PlayIntegrityProvider playIntegrityProvider;
        Object objA;
        if (continuationImpl instanceof PlayIntegrityProvider$warmUp$1) {
            playIntegrityProvider$warmUp$1 = (PlayIntegrityProvider$warmUp$1) continuationImpl;
            int i10 = playIntegrityProvider$warmUp$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                playIntegrityProvider$warmUp$1.label = i10 - Integer.MIN_VALUE;
            } else {
                playIntegrityProvider$warmUp$1 = new PlayIntegrityProvider$warmUp$1(this, continuationImpl);
            }
        } else {
            playIntegrityProvider$warmUp$1 = new PlayIntegrityProvider$warmUp$1(this, continuationImpl);
        }
        Object objE = playIntegrityProvider$warmUp$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = playIntegrityProvider$warmUp$1.label;
        if (i11 == 0) {
            kotlin.b.b(objE);
            Pa.a aVar = this.f30228h;
            if (aVar == null ? false : !aVar.B()) {
                return p293xa.r.f47939a;
            }
            try {
                playIntegrityProvider$warmUp$1.L$0 = this;
                playIntegrityProvider$warmUp$1.label = 1;
                objE = e(playIntegrityProvider$warmUp$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
                playIntegrityProvider = this;
            } catch (Throwable th) {
                th = th;
                playIntegrityProvider = this;
                objA = kotlin.b.a(th);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            playIntegrityProvider = (PlayIntegrityProvider) playIntegrityProvider$warmUp$1.L$0;
            try {
                kotlin.b.b(objE);
            } catch (Throwable th2) {
                th = th2;
                objA = kotlin.b.a(th);
            }
        }
        objA = (b6.a.c) objE;
        Throwable thA = Result.a(objA);
        if (thA != null) {
            playIntegrityProvider.f30222b.b("PlayIntegrityProvider", "Play Integrity warm-up failed: " + thA.getMessage());
        }
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // J8.m
    public final Object b(byte[] bArr, ContinuationImpl continuationImpl) {
        PlayIntegrityProvider$requestIntegrityToken$1 playIntegrityProvider$requestIntegrityToken$1;
        PlayIntegrityProvider playIntegrityProvider;
        long jI;
        Object objA;
        long j10;
        if (continuationImpl instanceof PlayIntegrityProvider$requestIntegrityToken$1) {
            playIntegrityProvider$requestIntegrityToken$1 = (PlayIntegrityProvider$requestIntegrityToken$1) continuationImpl;
            int i10 = playIntegrityProvider$requestIntegrityToken$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                playIntegrityProvider$requestIntegrityToken$1.label = i10 - Integer.MIN_VALUE;
            } else {
                playIntegrityProvider$requestIntegrityToken$1 = new PlayIntegrityProvider$requestIntegrityToken$1(this, continuationImpl);
            }
        } else {
            playIntegrityProvider$requestIntegrityToken$1 = new PlayIntegrityProvider$requestIntegrityToken$1(this, continuationImpl);
        }
        Object objB = playIntegrityProvider$requestIntegrityToken$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = playIntegrityProvider$requestIntegrityToken$1.label;
        if (i11 == 0) {
            kotlin.b.b(objB);
            if (bArr.length == 0) {
                this.f30222b.c("PlayIntegrityProvider", "Play Integrity token request failed: challenge is empty");
                return kotlin.b.a(new IntegrityException.InvalidChallenge("challenge is empty", null));
            }
            Pa.a aVar = this.f30228h;
            if (aVar == null ? false : !aVar.B()) {
                return kotlin.b.a(new IntegrityException.PlatformError("Play Integrity throttled, cooling down for ".concat(Pa.b.j(this.f30227g))));
            }
            String strEncodeToString = Base64.encodeToString(bArr, 11);
            aq aqVarS = aq.s();
            if (aqVarS == null) {
                throw new NullPointerException("Null verdictOptOut");
            }
            p019b6.v vVar = new p019b6.v(strEncodeToString, aqVarS);
            try {
                long j11 = f30218i;
                PlayIntegrityProvider$requestIntegrityToken$2$1 playIntegrityProvider$requestIntegrityToken$2$1 = new PlayIntegrityProvider$requestIntegrityToken$2$1(this, vVar, null);
                playIntegrityProvider$requestIntegrityToken$1.L$0 = this;
                playIntegrityProvider$requestIntegrityToken$1.label = 1;
                try {
                    int i12 = Pa.b.f4973e;
                    boolean z10 = j11 > 0;
                    if (z10) {
                        long jG = Pa.b.g(j11, C1787c0.u(999999L, DurationUnit.NANOSECONDS));
                        jI = ((((int) jG) & 1) != 1 || Pa.b.e(jG)) ? Pa.b.i(jG, DurationUnit.MILLISECONDS) : jG >> 1;
                    } else {
                        if (z10) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jI = 0;
                    }
                    objB = G0.b(jI, playIntegrityProvider$requestIntegrityToken$2$1, playIntegrityProvider$requestIntegrityToken$1);
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    playIntegrityProvider = this;
                } catch (Throwable th) {
                    th = th;
                    playIntegrityProvider = this;
                    objA = kotlin.b.a(th);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            playIntegrityProvider = (PlayIntegrityProvider) playIntegrityProvider$requestIntegrityToken$1.L$0;
            try {
                kotlin.b.b(objB);
            } catch (Throwable th3) {
                th = th3;
                objA = kotlin.b.a(th);
            }
        }
        objA = (String) objB;
        if (objA == null) {
            throw new IntegrityException.PlatformError("Timed out after ".concat(Pa.b.j(f30218i)));
        }
        boolean z11 = objA instanceof Result.Failure;
        if (!z11) {
            playIntegrityProvider.getClass();
            int i13 = Pa.b.f4973e;
            playIntegrityProvider.f30227g = 0L;
            playIntegrityProvider.f30228h = null;
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            playIntegrityProvider.getClass();
            Throwable cause = thA instanceof StandardIntegrityException ? (StandardIntegrityException) thA : null;
            if (cause == null) {
                cause = thA.getCause();
            }
            StandardIntegrityException standardIntegrityException = cause instanceof StandardIntegrityException ? (StandardIntegrityException) cause : null;
            if (standardIntegrityException != null && standardIntegrityException.b() == -8) {
                long j12 = playIntegrityProvider.f30227g;
                int i14 = Pa.b.f4973e;
                if (j12 == 0) {
                    j10 = j;
                } else {
                    Pa.b bVar = new Pa.b(Pa.b.h(2, playIntegrityProvider.f30227g));
                    Pa.b bVar2 = new Pa.b(f30219k);
                    if (bVar.compareTo(bVar2) > 0) {
                        bVar = bVar2;
                    }
                    j10 = bVar.f4974b;
                }
                playIntegrityProvider.f30227g = j10;
                Pa.e.a.C0073a c0073aA = playIntegrityProvider.f30223c.a();
                long j13 = playIntegrityProvider.f30227g;
                int i15 = Pa.d.f4977b;
                playIntegrityProvider.f30228h = new Pa.e.a.C0073a(O.e.y(c0073aA.f4979b, j13, DurationUnit.NANOSECONDS));
                playIntegrityProvider.f30222b.b("PlayIntegrityProvider", "Play Integrity throttled, pausing token requests for ".concat(Pa.b.j(playIntegrityProvider.f30227g)));
            }
            playIntegrityProvider.f30222b.c("PlayIntegrityProvider", "Play Integrity token request failed: " + thA.getMessage());
        }
        if (!z11) {
            IntegrityTokenType integrityTokenType = IntegrityTokenType.f30558b;
            objA = new H8.a((String) objA);
        }
        Throwable thA2 = Result.a(objA);
        if (thA2 == null) {
            return objA;
        }
        try {
            throw new IntegrityException.PlatformError("Play Integrity token request failed", thA2);
        } catch (Throwable th4) {
            return kotlin.b.a(th4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ContinuationImpl continuationImpl) throws Throwable {
        PlayIntegrityProvider$ensureTokenProvider$1 playIntegrityProvider$ensureTokenProvider$1;
        kotlinx.coroutines.sync.a aVar;
        PlayIntegrityProvider playIntegrityProvider;
        kotlinx.coroutines.sync.a aVar2;
        Throwable th;
        b6.a.c cVar;
        if (continuationImpl instanceof PlayIntegrityProvider$ensureTokenProvider$1) {
            playIntegrityProvider$ensureTokenProvider$1 = (PlayIntegrityProvider$ensureTokenProvider$1) continuationImpl;
            int i10 = playIntegrityProvider$ensureTokenProvider$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                playIntegrityProvider$ensureTokenProvider$1.label = i10 - Integer.MIN_VALUE;
            } else {
                playIntegrityProvider$ensureTokenProvider$1 = new PlayIntegrityProvider$ensureTokenProvider$1(this, continuationImpl);
            }
        } else {
            playIntegrityProvider$ensureTokenProvider$1 = new PlayIntegrityProvider$ensureTokenProvider$1(this, continuationImpl);
        }
        Object obj = playIntegrityProvider$ensureTokenProvider$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = playIntegrityProvider$ensureTokenProvider$1.label;
        try {
            if (i11 == 0) {
                kotlin.b.b(obj);
                b6.a.c cVar2 = this.f30226f;
                if (cVar2 != null) {
                    return cVar2;
                }
                aVar = this.f30225e;
                playIntegrityProvider$ensureTokenProvider$1.L$0 = this;
                playIntegrityProvider$ensureTokenProvider$1.L$1 = aVar;
                playIntegrityProvider$ensureTokenProvider$1.label = 1;
                if (aVar.f(null, playIntegrityProvider$ensureTokenProvider$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                playIntegrityProvider = this;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (kotlinx.coroutines.sync.a) playIntegrityProvider$ensureTokenProvider$1.L$0;
                    try {
                        kotlin.b.b(obj);
                        cVar = (b6.a.c) obj;
                        aVar = aVar2;
                        aVar.g(null);
                        return cVar;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2.g(null);
                        throw th;
                    }
                }
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) playIntegrityProvider$ensureTokenProvider$1.L$1;
                playIntegrityProvider = (PlayIntegrityProvider) playIntegrityProvider$ensureTokenProvider$1.L$0;
                kotlin.b.b(obj);
                aVar = aVar3;
            }
            cVar = playIntegrityProvider.f30226f;
            if (cVar == null) {
                playIntegrityProvider$ensureTokenProvider$1.L$0 = aVar;
                playIntegrityProvider$ensureTokenProvider$1.L$1 = null;
                playIntegrityProvider$ensureTokenProvider$1.label = 2;
                Object objF = playIntegrityProvider.f(playIntegrityProvider$ensureTokenProvider$1);
                if (objF == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar2 = aVar;
                obj = objF;
                cVar = (b6.a.c) obj;
                aVar = aVar2;
            }
            aVar.g(null);
            return cVar;
        } catch (Throwable th3) {
            aVar2 = aVar;
            th = th3;
            aVar2.g(null);
            throw th;
        }
    }

    public final Object f(kotlin.coroutines.c<? super b6.a.c> cVar) {
        final C2693i c2693i = new C2693i(1, A8.p.y(cVar));
        c2693i.s();
        byte b10 = (byte) (((byte) 2) | 1);
        if (b10 == 3) {
            this.f30224d.a(new p019b6.u(this.f30221a)).e(new c(new Ia.l<b6.a.c, p293xa.r>() { // from class: com.voltasit.obdeleven.data.providers.PlayIntegrityProvider$prepareTokenProvider$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(b6.a.c cVar2) {
                    b6.a.c cVar3 = cVar2;
                    this.this$0.f30226f = cVar3;
                    if (c2693i.c()) {
                        c2693i.resumeWith(cVar3);
                    }
                    return p293xa.r.f47939a;
                }
            })).r(new b(c2693i));
            Object objP = c2693i.p();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            return objP;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & b10) == 0) {
            sb2.append(" cloudProjectNumber");
        }
        if ((2 & b10) == 0) {
            sb2.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ContinuationImpl continuationImpl) {
        PlayIntegrityProvider$resetTokenProvider$1 playIntegrityProvider$resetTokenProvider$1;
        PlayIntegrityProvider playIntegrityProvider;
        kotlinx.coroutines.sync.a aVar;
        if (continuationImpl instanceof PlayIntegrityProvider$resetTokenProvider$1) {
            playIntegrityProvider$resetTokenProvider$1 = (PlayIntegrityProvider$resetTokenProvider$1) continuationImpl;
            int i10 = playIntegrityProvider$resetTokenProvider$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                playIntegrityProvider$resetTokenProvider$1.label = i10 - Integer.MIN_VALUE;
            } else {
                playIntegrityProvider$resetTokenProvider$1 = new PlayIntegrityProvider$resetTokenProvider$1(this, continuationImpl);
            }
        } else {
            playIntegrityProvider$resetTokenProvider$1 = new PlayIntegrityProvider$resetTokenProvider$1(this, continuationImpl);
        }
        Object obj = playIntegrityProvider$resetTokenProvider$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = playIntegrityProvider$resetTokenProvider$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            MutexImpl mutexImpl = this.f30225e;
            playIntegrityProvider$resetTokenProvider$1.L$0 = this;
            playIntegrityProvider$resetTokenProvider$1.L$1 = mutexImpl;
            playIntegrityProvider$resetTokenProvider$1.label = 1;
            if (mutexImpl.f(null, playIntegrityProvider$resetTokenProvider$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            playIntegrityProvider = this;
            aVar = mutexImpl;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (kotlinx.coroutines.sync.a) playIntegrityProvider$resetTokenProvider$1.L$1;
            playIntegrityProvider = (PlayIntegrityProvider) playIntegrityProvider$resetTokenProvider$1.L$0;
            kotlin.b.b(obj);
        }
        try {
            playIntegrityProvider.f30226f = null;
            p293xa.r rVar = p293xa.r.f47939a;
            return p293xa.r.f47939a;
        } finally {
            aVar.g(null);
        }
    }
}
