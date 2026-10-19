package m8;

/* JADX INFO: compiled from: UDSBasicSettingStatus.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44637a;

    /* JADX INFO: compiled from: UDSBasicSettingStatus.kt */
    public static final class a extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f44638b = new a("MAS00086", "C0");
    }

    /* JADX INFO: compiled from: UDSBasicSettingStatus.kt */
    public static final class b extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f44639b = new b("MAS00709", "10");
    }

    /* JADX INFO: compiled from: UDSBasicSettingStatus.kt */
    public static final class c extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f44640b = new c("MAS03421", "60");
    }

    /* JADX INFO: compiled from: UDSBasicSettingStatus.kt */
    public static final class d {
        public static o a(String str) {
            if (kotlin.text.m.I(str, "00", false)) {
                return h.f44643b;
            }
            if (kotlin.text.m.I(str, "10", false)) {
                return b.f44639b;
            }
            if (kotlin.text.m.I(str, "40", false)) {
                return f.f44642b;
            }
            if (kotlin.text.m.I(str, "60", false)) {
                return c.f44640b;
            }
            if (kotlin.text.m.I(str, "80", false)) {
                return e.f44641b;
            }
            return kotlin.text.m.I(str, "C0", false) ? a.f44638b : i.f44644b;
        }
    }

    /* JADX INFO: compiled from: UDSBasicSettingStatus.kt */
    public static final class e extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f44641b = new e("MAS00113", "80");
    }

    /* JADX INFO: compiled from: UDSBasicSettingStatus.kt */
    public static final class f extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f44642b = new f("MAS01173", "40");
    }

    /* JADX INFO: compiled from: UDSBasicSettingStatus.kt */
    public static final class g extends o {
    }

    /* JADX INFO: compiled from: UDSBasicSettingStatus.kt */
    public static final class h extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f44643b = new h("MAS00112", "00");
    }

    /* JADX INFO: compiled from: UDSBasicSettingStatus.kt */
    public static final class i extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f44644b = new i("", "");
    }

    public o(String str, String str2) {
        this.f44637a = str;
    }
}
