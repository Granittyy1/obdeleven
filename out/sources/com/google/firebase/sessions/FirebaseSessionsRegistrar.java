package com.google.firebase.sessions;

import A1.C0575j;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import kotlinx.coroutines.AbstractC2712w;

/* JADX INFO: compiled from: FirebaseSessionsRegistrar.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final a Companion = new a();

    @Deprecated
    private static final p228s6.p<p144l6.e> firebaseApp = p228s6.p.a(p144l6.e.class);

    @Deprecated
    private static final p228s6.p<p108i7.c> firebaseInstallationsApi = p228s6.p.a(p108i7.c.class);

    @Deprecated
    private static final p228s6.p<AbstractC2712w> backgroundDispatcher = new p228s6.p<>(p217r6.a.class, AbstractC2712w.class);

    @Deprecated
    private static final p228s6.p<AbstractC2712w> blockingDispatcher = new p228s6.p<>(p217r6.b.class, AbstractC2712w.class);

    @Deprecated
    private static final p228s6.p<p311z4.h> transportFactory = p228s6.p.a(p311z4.h.class);

    @Deprecated
    private static final p228s6.p<SessionsSettings> sessionsSettings = p228s6.p.a(SessionsSettings.class);

    /* JADX INFO: compiled from: FirebaseSessionsRegistrar.kt */
    public static final class a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-0, reason: not valid java name */
    public static final FirebaseSessions m9getComponents$lambda0(p228s6.b bVar) {
        Object objC = bVar.c(firebaseApp);
        kotlin.jvm.internal.i.d(objC, "container[firebaseApp]");
        Object objC2 = bVar.c(sessionsSettings);
        kotlin.jvm.internal.i.d(objC2, "container[sessionsSettings]");
        Object objC3 = bVar.c(backgroundDispatcher);
        kotlin.jvm.internal.i.d(objC3, "container[backgroundDispatcher]");
        return new FirebaseSessions((p144l6.e) objC, (SessionsSettings) objC2, (kotlin.coroutines.e) objC3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-1, reason: not valid java name */
    public static final s m10getComponents$lambda1(p228s6.b bVar) {
        return new s(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-2, reason: not valid java name */
    public static final r m11getComponents$lambda2(p228s6.b bVar) {
        Object objC = bVar.c(firebaseApp);
        kotlin.jvm.internal.i.d(objC, "container[firebaseApp]");
        p144l6.e eVar = (p144l6.e) objC;
        Object objC2 = bVar.c(firebaseInstallationsApi);
        kotlin.jvm.internal.i.d(objC2, "container[firebaseInstallationsApi]");
        p108i7.c cVar = (p108i7.c) objC2;
        Object objC3 = bVar.c(sessionsSettings);
        kotlin.jvm.internal.i.d(objC3, "container[sessionsSettings]");
        SessionsSettings sessionsSettings2 = (SessionsSettings) objC3;
        p096h7.b bVarG = bVar.g(transportFactory);
        kotlin.jvm.internal.i.d(bVarG, "container.getProvider(transportFactory)");
        F3.e eVar2 = new F3.e(bVarG);
        Object objC4 = bVar.c(backgroundDispatcher);
        kotlin.jvm.internal.i.d(objC4, "container[backgroundDispatcher]");
        return new SessionFirelogPublisherImpl(eVar, cVar, sessionsSettings2, eVar2, (kotlin.coroutines.e) objC4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-3, reason: not valid java name */
    public static final SessionsSettings m12getComponents$lambda3(p228s6.b bVar) {
        Object objC = bVar.c(firebaseApp);
        kotlin.jvm.internal.i.d(objC, "container[firebaseApp]");
        Object objC2 = bVar.c(blockingDispatcher);
        kotlin.jvm.internal.i.d(objC2, "container[blockingDispatcher]");
        Object objC3 = bVar.c(backgroundDispatcher);
        kotlin.jvm.internal.i.d(objC3, "container[backgroundDispatcher]");
        Object objC4 = bVar.c(firebaseInstallationsApi);
        kotlin.jvm.internal.i.d(objC4, "container[firebaseInstallationsApi]");
        return new SessionsSettings((p144l6.e) objC, (kotlin.coroutines.e) objC2, (kotlin.coroutines.e) objC3, (p108i7.c) objC4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-4, reason: not valid java name */
    public static final n m13getComponents$lambda4(p228s6.b bVar) {
        p144l6.e eVar = (p144l6.e) bVar.c(firebaseApp);
        eVar.a();
        Context context = eVar.f44388a;
        kotlin.jvm.internal.i.d(context, "container[firebaseApp].applicationContext");
        Object objC = bVar.c(backgroundDispatcher);
        kotlin.jvm.internal.i.d(objC, "container[backgroundDispatcher]");
        return new SessionDatastoreImpl(context, (kotlin.coroutines.e) objC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-5, reason: not valid java name */
    public static final w m14getComponents$lambda5(p228s6.b bVar) {
        Object objC = bVar.c(firebaseApp);
        kotlin.jvm.internal.i.d(objC, "container[firebaseApp]");
        return new x((p144l6.e) objC);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p228s6.a<? extends Object>> getComponents() {
        p228s6.a.C0531a c0531aA = p228s6.a.a(FirebaseSessions.class);
        c0531aA.f46937a = LIBRARY_NAME;
        p228s6.p<p144l6.e> pVar = firebaseApp;
        c0531aA.a(p228s6.j.c(pVar));
        p228s6.p<SessionsSettings> pVar2 = sessionsSettings;
        c0531aA.a(p228s6.j.c(pVar2));
        p228s6.p<AbstractC2712w> pVar3 = backgroundDispatcher;
        c0531aA.a(p228s6.j.c(pVar3));
        c0531aA.f46942f = new coil.intercept.a();
        c0531aA.c(2);
        p228s6.a aVarB = c0531aA.b();
        p228s6.a.C0531a c0531aA2 = p228s6.a.a(s.class);
        c0531aA2.f46937a = "session-generator";
        c0531aA2.f46942f = new androidx.compose.ui.text.font.s(3);
        p228s6.a aVarB2 = c0531aA2.b();
        p228s6.a.C0531a c0531aA3 = p228s6.a.a(r.class);
        c0531aA3.f46937a = "session-publisher";
        c0531aA3.a(new p228s6.j(pVar, 1, 0));
        p228s6.p<p108i7.c> pVar4 = firebaseInstallationsApi;
        c0531aA3.a(p228s6.j.c(pVar4));
        c0531aA3.a(new p228s6.j(pVar2, 1, 0));
        c0531aA3.a(new p228s6.j(transportFactory, 1, 1));
        c0531aA3.a(new p228s6.j(pVar3, 1, 0));
        c0531aA3.f46942f = new B1.a(5);
        p228s6.a aVarB3 = c0531aA3.b();
        p228s6.a.C0531a c0531aA4 = p228s6.a.a(SessionsSettings.class);
        c0531aA4.f46937a = "sessions-settings";
        c0531aA4.a(new p228s6.j(pVar, 1, 0));
        c0531aA4.a(p228s6.j.c(blockingDispatcher));
        c0531aA4.a(new p228s6.j(pVar3, 1, 0));
        c0531aA4.a(new p228s6.j(pVar4, 1, 0));
        c0531aA4.f46942f = new p005a4.o();
        p228s6.a aVarB4 = c0531aA4.b();
        p228s6.a.C0531a c0531aA5 = p228s6.a.a(n.class);
        c0531aA5.f46937a = "sessions-datastore";
        c0531aA5.a(new p228s6.j(pVar, 1, 0));
        c0531aA5.a(new p228s6.j(pVar3, 1, 0));
        c0531aA5.f46942f = new p005a4.p(5);
        p228s6.a aVarB5 = c0531aA5.b();
        p228s6.a.C0531a c0531aA6 = p228s6.a.a(w.class);
        c0531aA6.f46937a = "sessions-service-binder";
        c0531aA6.a(new p228s6.j(pVar, 1, 0));
        c0531aA6.f46942f = new C0575j(5);
        return kotlin.collections.l.s(aVarB, aVarB2, aVarB3, aVarB4, aVarB5, c0531aA6.b(), B7.g.a(LIBRARY_NAME, "1.2.3"));
    }
}
