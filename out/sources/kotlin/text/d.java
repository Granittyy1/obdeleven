package kotlin.text;

import com.braze.support.BrazeLogger;

/* JADX INFO: compiled from: HexFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f43139d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f43141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f43142c;

    /* JADX INFO: compiled from: HexFormat.kt */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f43143d = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f43144a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f43145b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f43146c;

        public a() {
            boolean z10 = true;
            if (!D9.o.f("  ") && !D9.o.f("") && !D9.o.f("") && !D9.o.f("")) {
                z10 = false;
            }
            this.f43146c = z10;
        }

        public final void a(StringBuilder sb2, String str) {
            sb2.append(str);
            sb2.append("bytesPerLine = ");
            sb2.append(BrazeLogger.SUPPRESS);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("bytesPerGroup = ");
            sb2.append(BrazeLogger.SUPPRESS);
            sb2.append(",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("groupSeparator = \"");
            sb2.append("  ");
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("byteSeparator = \"");
            sb2.append("");
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("bytePrefix = \"");
            sb2.append("");
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("byteSuffix = \"");
            sb2.append("");
            sb2.append("\"");
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(\n");
            a(sb2, "    ");
            sb2.append('\n');
            sb2.append(")");
            String string = sb2.toString();
            kotlin.jvm.internal.i.d(string, "toString(...)");
            return string;
        }
    }

    /* JADX INFO: compiled from: HexFormat.kt */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f43147b = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f43148a = true;

        public b() {
            if (D9.o.f("")) {
                return;
            }
            D9.o.f("");
        }

        public final void a(StringBuilder sb2, String str) {
            sb2.append(str);
            sb2.append("prefix = \"");
            sb2.append("");
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("suffix = \"");
            sb2.append("");
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("removeLeadingZeros = ");
            sb2.append(false);
            sb2.append(',');
            sb2.append('\n');
            sb2.append(str);
            sb2.append("minLength = ");
            sb2.append(1);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(\n");
            a(sb2, "    ");
            sb2.append('\n');
            sb2.append(")");
            String string = sb2.toString();
            kotlin.jvm.internal.i.d(string, "toString(...)");
            return string;
        }
    }

    static {
        a aVar = a.f43143d;
        b bVar = b.f43147b;
        f43139d = new d(false, aVar, bVar);
        new d(true, aVar, bVar);
    }

    public d(boolean z10, a bytes, b number) {
        kotlin.jvm.internal.i.e(bytes, "bytes");
        kotlin.jvm.internal.i.e(number, "number");
        this.f43140a = z10;
        this.f43141b = bytes;
        this.f43142c = number;
    }

    public final String toString() {
        StringBuilder sbE = C4.b.e("HexFormat(\n    upperCase = ");
        sbE.append(this.f43140a);
        sbE.append(",\n    bytes = BytesHexFormat(\n");
        this.f43141b.a(sbE, "        ");
        sbE.append('\n');
        sbE.append("    ),");
        sbE.append('\n');
        sbE.append("    number = NumberHexFormat(");
        sbE.append('\n');
        this.f43142c.a(sbE, "        ");
        sbE.append('\n');
        sbE.append("    )");
        sbE.append('\n');
        sbE.append(")");
        String string = sbE.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }
}
