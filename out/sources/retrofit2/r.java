package retrofit2;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorC2787a f46769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f46770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f46771c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f46769a = null;
            f46770b = new s();
            f46771c = new c();
        } else if (property.equals("Dalvik")) {
            f46769a = new ExecutorC2787a();
            f46770b = new s.a();
            f46771c = new c.a();
        } else {
            f46769a = null;
            f46770b = new s.b();
            f46771c = new c.a();
        }
    }
}
