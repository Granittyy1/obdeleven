package com.google.firebase.sessions;

import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.B;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: SessionFirelogPublisher.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionFirelogPublisherImpl implements r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final double f28650f = Math.random();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f28651g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p144l6.e f28652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p108i7.c f28653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SessionsSettings f28654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F3.e f28655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlin.coroutines.e f28656e;

    public SessionFirelogPublisherImpl(p144l6.e eVar, p108i7.c cVar, SessionsSettings sessionsSettings, F3.e eVar2, kotlin.coroutines.e eVar3) {
        this.f28652a = eVar;
        this.f28653b = cVar;
        this.f28654c = sessionsSettings;
        this.f28655d = eVar2;
        this.f28656e = eVar3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, ContinuationImpl continuationImpl) {
        SessionFirelogPublisherImpl$shouldLogSession$1 sessionFirelogPublisherImpl$shouldLogSession$1;
        sessionFirelogPublisherImpl.getClass();
        if (continuationImpl instanceof SessionFirelogPublisherImpl$shouldLogSession$1) {
            sessionFirelogPublisherImpl$shouldLogSession$1 = (SessionFirelogPublisherImpl$shouldLogSession$1) continuationImpl;
            int i10 = sessionFirelogPublisherImpl$shouldLogSession$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sessionFirelogPublisherImpl$shouldLogSession$1.label = i10 - Integer.MIN_VALUE;
            } else {
                sessionFirelogPublisherImpl$shouldLogSession$1 = new SessionFirelogPublisherImpl$shouldLogSession$1(sessionFirelogPublisherImpl, continuationImpl);
            }
        } else {
            sessionFirelogPublisherImpl$shouldLogSession$1 = new SessionFirelogPublisherImpl$shouldLogSession$1(sessionFirelogPublisherImpl, continuationImpl);
        }
        Object obj = sessionFirelogPublisherImpl$shouldLogSession$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = sessionFirelogPublisherImpl$shouldLogSession$1.label;
        boolean zBooleanValue = true;
        if (i11 == 0) {
            kotlin.b.b(obj);
            sessionFirelogPublisherImpl$shouldLogSession$1.L$0 = sessionFirelogPublisherImpl;
            sessionFirelogPublisherImpl$shouldLogSession$1.label = 1;
            if (sessionFirelogPublisherImpl.f28654c.b(sessionFirelogPublisherImpl$shouldLogSession$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sessionFirelogPublisherImpl = (SessionFirelogPublisherImpl) sessionFirelogPublisherImpl$shouldLogSession$1.L$0;
            kotlin.b.b(obj);
        }
        SessionsSettings sessionsSettings = sessionFirelogPublisherImpl.f28654c;
        Boolean boolA = sessionsSettings.f28750a.a();
        if (boolA != null) {
            zBooleanValue = boolA.booleanValue();
        } else {
            Boolean boolA2 = sessionsSettings.f28751b.a();
            if (boolA2 != null) {
                zBooleanValue = boolA2.booleanValue();
            }
        }
        if (zBooleanValue) {
            return f28650f <= sessionFirelogPublisherImpl.f28654c.a() ? Boolean.TRUE : Boolean.FALSE;
        }
        return Boolean.FALSE;
    }

    @Override // com.google.firebase.sessions.r
    public final void a(o oVar) {
        C2680e.c(B.a(this.f28656e), null, null, new SessionFirelogPublisherImpl$logSession$1(this, oVar, null), 3);
    }
}
