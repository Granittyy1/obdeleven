package Ab;

/* JADX INFO: compiled from: StringMaker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f1063f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1064a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1065b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1066c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1067d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1068e;

    static {
        e eVar = new e();
        eVar.f1064a = true;
        eVar.f1065b = false;
        eVar.f1066c = false;
        eVar.f1067d = true;
        e eVar2 = new e();
        f1063f = eVar2;
        eVar2.f1064a = true;
        eVar2.f1065b = true;
        eVar2.f1066c = false;
        eVar2.f1067d = false;
        eVar.f1068e = 1;
        e eVar3 = new e();
        eVar3.f1064a = false;
        eVar3.f1065b = true;
        eVar3.f1066c = true;
        eVar3.f1067d = false;
        eVar3.f1068e = 2;
    }

    public static String a(Class cls, String str, boolean z10) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            return a(componentType, componentType.getName(), z10) + "[]";
        }
        if (!z10) {
            return str.replace('$', '.');
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            str = str.substring(iLastIndexOf + 1);
        }
        return str.replace('$', '.');
    }
}
