package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SessionFirelogPublisher.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", l = {R.styleable.AppCompatTheme_dialogTheme, R.styleable.AppCompatTheme_dividerHorizontal, R.styleable.AppCompatTheme_editTextStyle}, m = "invokeSuspend")
public final class SessionFirelogPublisherImpl$logSession$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ o $sessionDetails;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ SessionFirelogPublisherImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionFirelogPublisherImpl$logSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, o oVar, kotlin.coroutines.c<? super SessionFirelogPublisherImpl$logSession$1> cVar) {
        super(2, cVar);
        this.this$0 = sessionFirelogPublisherImpl;
        this.$sessionDetails = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SessionFirelogPublisherImpl$logSession$1(this.this$0, this.$sessionDetails, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SessionFirelogPublisherImpl$logSession$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00db  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objA;
        k kVar;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
        q qVar;
        p144l6.e eVar;
        o oVar;
        SessionsSettings sessionsSettings;
        Object objB2;
        SessionsSettings sessionsSettings2;
        p144l6.e firebaseApp;
        o sessionDetails;
        k kVar2;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl2;
        q qVar2;
        SessionSubscriber sessionSubscriber;
        DataCollectionState dataCollectionState;
        DataCollectionState dataCollectionState2;
        DataCollectionState dataCollectionState3;
        DataCollectionState dataCollectionState4;
        SessionSubscriber sessionSubscriber2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
                objB = obj;
            } else if (i10 == 2) {
                kotlin.b.b(obj);
                objA = obj;
                kVar = (k) objA;
                sessionFirelogPublisherImpl = this.this$0;
                qVar = q.f28736a;
                eVar = sessionFirelogPublisherImpl.f28652a;
                oVar = this.$sessionDetails;
                sessionsSettings = sessionFirelogPublisherImpl.f28654c;
                com.google.firebase.sessions.api.a aVar = com.google.firebase.sessions.api.a.f28674a;
                this.L$0 = kVar;
                this.L$1 = sessionFirelogPublisherImpl;
                this.L$2 = qVar;
                this.L$3 = eVar;
                this.L$4 = oVar;
                this.L$5 = sessionsSettings;
                this.label = 3;
                objB2 = aVar.b(this);
                if (objB2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                sessionsSettings2 = sessionsSettings;
                firebaseApp = eVar;
                sessionDetails = oVar;
                kVar2 = kVar;
                sessionFirelogPublisherImpl2 = sessionFirelogPublisherImpl;
                qVar2 = qVar;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sessionsSettings2 = (SessionsSettings) this.L$5;
                sessionDetails = (o) this.L$4;
                p144l6.e eVar2 = (p144l6.e) this.L$3;
                q qVar3 = (q) this.L$2;
                SessionFirelogPublisherImpl sessionFirelogPublisherImpl3 = (SessionFirelogPublisherImpl) this.L$1;
                k kVar3 = (k) this.L$0;
                kotlin.b.b(obj);
                kVar2 = kVar3;
                sessionFirelogPublisherImpl2 = sessionFirelogPublisherImpl3;
                qVar2 = qVar3;
                firebaseApp = eVar2;
                objB2 = obj;
            }
            Map subscribers = (Map) objB2;
            String str = kVar2.f28722a;
            qVar2.getClass();
            kotlin.jvm.internal.i.e(firebaseApp, "firebaseApp");
            kotlin.jvm.internal.i.e(sessionDetails, "sessionDetails");
            kotlin.jvm.internal.i.e(sessionsSettings2, "sessionsSettings");
            kotlin.jvm.internal.i.e(subscribers, "subscribers");
            String firebaseAuthenticationToken = kVar2.f28723b;
            kotlin.jvm.internal.i.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
            sessionSubscriber = (SessionSubscriber) subscribers.get(SessionSubscriber.Name.f28671c);
            dataCollectionState = DataCollectionState.COLLECTION_DISABLED;
            dataCollectionState2 = DataCollectionState.COLLECTION_ENABLED;
            dataCollectionState3 = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
            if (sessionSubscriber == null) {
                dataCollectionState4 = dataCollectionState3;
            } else if (sessionSubscriber.a()) {
                dataCollectionState4 = dataCollectionState2;
            } else {
                dataCollectionState4 = dataCollectionState;
            }
            sessionSubscriber2 = (SessionSubscriber) subscribers.get(SessionSubscriber.Name.f28670b);
            if (sessionSubscriber2 == null) {
                dataCollectionState = dataCollectionState3;
            } else if (sessionSubscriber2.a()) {
                dataCollectionState = dataCollectionState2;
            }
            p pVar = new p(new t(sessionDetails.f28730a, sessionDetails.f28731b, sessionDetails.f28732c, sessionDetails.f28733d, new i(dataCollectionState4, dataCollectionState, sessionsSettings2.a()), str, firebaseAuthenticationToken), q.a(firebaseApp));
            int i11 = SessionFirelogPublisherImpl.f28651g;
            sessionFirelogPublisherImpl2.getClass();
            try {
                sessionFirelogPublisherImpl2.f28655d.a(pVar);
            } catch (RuntimeException e10) {
                Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e10);
            }
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl4 = this.this$0;
        this.label = 1;
        objB = SessionFirelogPublisherImpl.b(sessionFirelogPublisherImpl4, this);
        if (objB == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (((Boolean) objB).booleanValue()) {
            k.a aVar2 = k.f28721c;
            p108i7.c cVar = this.this$0.f28653b;
            this.label = 2;
            objA = aVar2.a(cVar, this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            kVar = (k) objA;
            sessionFirelogPublisherImpl = this.this$0;
            qVar = q.f28736a;
            eVar = sessionFirelogPublisherImpl.f28652a;
            oVar = this.$sessionDetails;
            sessionsSettings = sessionFirelogPublisherImpl.f28654c;
            com.google.firebase.sessions.api.a aVar3 = com.google.firebase.sessions.api.a.f28674a;
            this.L$0 = kVar;
            this.L$1 = sessionFirelogPublisherImpl;
            this.L$2 = qVar;
            this.L$3 = eVar;
            this.L$4 = oVar;
            this.L$5 = sessionsSettings;
            this.label = 3;
            objB2 = aVar3.b(this);
            if (objB2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            sessionsSettings2 = sessionsSettings;
            firebaseApp = eVar;
            sessionDetails = oVar;
            kVar2 = kVar;
            sessionFirelogPublisherImpl2 = sessionFirelogPublisherImpl;
            qVar2 = qVar;
            Map subscribers2 = (Map) objB2;
            String str2 = kVar2.f28722a;
            qVar2.getClass();
            kotlin.jvm.internal.i.e(firebaseApp, "firebaseApp");
            kotlin.jvm.internal.i.e(sessionDetails, "sessionDetails");
            kotlin.jvm.internal.i.e(sessionsSettings2, "sessionsSettings");
            kotlin.jvm.internal.i.e(subscribers2, "subscribers");
            String firebaseAuthenticationToken2 = kVar2.f28723b;
            kotlin.jvm.internal.i.e(firebaseAuthenticationToken2, "firebaseAuthenticationToken");
            sessionSubscriber = (SessionSubscriber) subscribers2.get(SessionSubscriber.Name.f28671c);
            dataCollectionState = DataCollectionState.COLLECTION_DISABLED;
            dataCollectionState2 = DataCollectionState.COLLECTION_ENABLED;
            dataCollectionState3 = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
            if (sessionSubscriber == null) {
                dataCollectionState4 = dataCollectionState3;
            } else if (sessionSubscriber.a()) {
                dataCollectionState4 = dataCollectionState2;
            } else {
                dataCollectionState4 = dataCollectionState;
            }
            sessionSubscriber2 = (SessionSubscriber) subscribers2.get(SessionSubscriber.Name.f28670b);
            if (sessionSubscriber2 == null) {
                dataCollectionState = dataCollectionState3;
            } else if (sessionSubscriber2.a()) {
                dataCollectionState = dataCollectionState2;
            }
            p pVar2 = new p(new t(sessionDetails.f28730a, sessionDetails.f28731b, sessionDetails.f28732c, sessionDetails.f28733d, new i(dataCollectionState4, dataCollectionState, sessionsSettings2.a()), str2, firebaseAuthenticationToken2), q.a(firebaseApp));
            int i12 = SessionFirelogPublisherImpl.f28651g;
            sessionFirelogPublisherImpl2.getClass();
            sessionFirelogPublisherImpl2.f28655d.a(pVar2);
        }
        return p293xa.r.f47939a;
    }
}
