package org.koin.compose;

import E3.b;
import Ia.a;
import androidx.compose.runtime.C;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import org.koin.core.logger.Level;

/* JADX INFO: compiled from: KoinApplication.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class KoinApplicationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f45751a;

    static {
        CompositionLocalKt.c(new a<Ib.a>() { // from class: org.koin.compose.KoinApplicationKt$LocalKoinApplication$1
            @Override // Ia.a
            public final Ib.a invoke() {
                C c10 = KoinApplicationKt.f45751a;
                Ib.a aVar = Kb.a.f4375b;
                if (aVar == null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                b bVar = aVar.f3937c;
                bVar.getClass();
                bVar.E(Level.f45769c, "[Warning] - No Koin context defined in Compose, fallback to default Koin context.\nUse KoinContext(), KoinAndroidContext() or KoinApplication() to setup or create Koin context with Compose and avoid such message.");
                return aVar;
            }
        });
        f45751a = CompositionLocalKt.c(new a<org.koin.core.scope.a>() { // from class: org.koin.compose.KoinApplicationKt$LocalKoinScope$1
            @Override // Ia.a
            public final org.koin.core.scope.a invoke() {
                C c10 = KoinApplicationKt.f45751a;
                Ib.a aVar = Kb.a.f4375b;
                if (aVar == null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                b bVar = aVar.f3937c;
                bVar.getClass();
                bVar.E(Level.f45769c, "[Warning] - No Koin context defined in Compose, fallback to default Koin context.\nUse KoinContext(), KoinAndroidContext() or KoinApplication() to setup or create Koin context with Compose and avoid such message.");
                return aVar.f3935a.f5143b;
            }
        });
    }

    public static final org.koin.core.scope.a a(InterfaceC1084f interfaceC1084f) {
        interfaceC1084f.e(-939861293);
        interfaceC1084f.e(-492369756);
        Object objF = interfaceC1084f.f();
        if (objF == InterfaceC1084f.a.f12980a) {
            objF = (org.koin.core.scope.a) interfaceC1084f.x(f45751a);
            interfaceC1084f.E(objF);
        }
        interfaceC1084f.I();
        org.koin.core.scope.a aVar = (org.koin.core.scope.a) objF;
        interfaceC1084f.I();
        return aVar;
    }
}
