package Jb;

/* JADX INFO: compiled from: KoinComponent.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: Jb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: KoinComponent.kt */
    public static final class C0058a {
        public static Ib.a a() {
            Ib.a aVar = Kb.a.f4375b;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("KoinApplication has not been started");
        }
    }

    Ib.a i();
}
