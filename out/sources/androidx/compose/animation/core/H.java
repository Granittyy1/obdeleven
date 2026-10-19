package androidx.compose.animation.core;

import io.intercom.android.sdk.models.AttributeType;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f9363c;

    public H(String content, List parameters) {
        this.f9361a = 2;
        kotlin.jvm.internal.i.e(content, "content");
        kotlin.jvm.internal.i.e(parameters, "parameters");
        this.f9362b = content;
        this.f9363c = parameters;
    }

    public abstract int[] a(int i10);

    public int[] b(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = (int[]) this.f9363c;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    public String c() {
        String str = (String) this.f9362b;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.i.m(AttributeType.TEXT);
        throw null;
    }

    public abstract int[] d(int i10);

    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:58:0x0103  */
    /* JADX WARN: Code duplicated, block: B:60:0x0107  */
    /* JADX WARN: Code duplicated, block: B:61:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x010f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0115  */
    /* JADX WARN: Code duplicated, block: B:66:0x012b A[LOOP:4: B:44:0x00c3->B:66:0x012b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00d5 A[SYNTHETIC] */
    public String toString() {
        StringBuilder sb2;
        int length;
        int i10;
        char cCharAt;
        int length2;
        int i11;
        int i12 = 2;
        switch (this.f9361a) {
            case 2:
                List<io.ktor.http.e> list = (List) this.f9363c;
                boolean zIsEmpty = list.isEmpty();
                String str = (String) this.f9362b;
                if (zIsEmpty) {
                    return str;
                }
                int length3 = str.length();
                int length4 = 0;
                for (io.ktor.http.e eVar : list) {
                    length4 += eVar.f40477b.length() + eVar.f40476a.length() + 3;
                }
                StringBuilder sb3 = new StringBuilder(length3 + length4);
                sb3.append(str);
                int iR = kotlin.collections.l.r(list);
                if (iR >= 0) {
                    int i13 = 0;
                    while (true) {
                        io.ktor.http.e eVar2 = (io.ktor.http.e) list.get(i13);
                        sb3.append("; ");
                        sb3.append(eVar2.f40476a);
                        sb3.append("=");
                        Set<Character> set = io.ktor.http.f.f40478a;
                        String str2 = eVar2.f40477b;
                        if (str2.length() != 0) {
                            if (str2.length() < i12) {
                                length2 = str2.length();
                                i11 = 0;
                                while (true) {
                                    if (i11 < length2) {
                                        if (io.ktor.http.f.f40478a.contains(Character.valueOf(str2.charAt(i11)))) {
                                            sb2 = new StringBuilder("\"");
                                            length = str2.length();
                                            for (i10 = 0; i10 < length; i10++) {
                                                cCharAt = str2.charAt(i10);
                                                if (cCharAt == '\\') {
                                                    sb2.append("\\\\");
                                                } else if (cCharAt == '\n') {
                                                    sb2.append("\\n");
                                                } else if (cCharAt == '\r') {
                                                    sb2.append("\\r");
                                                } else if (cCharAt == '\t') {
                                                    sb2.append("\\t");
                                                } else if (cCharAt == '\"') {
                                                    sb2.append("\\\"");
                                                } else {
                                                    sb2.append(cCharAt);
                                                }
                                            }
                                            sb2.append("\"");
                                            String string = sb2.toString();
                                            kotlin.jvm.internal.i.d(string, "StringBuilder().apply(builderAction).toString()");
                                            sb3.append(string);
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                            } else {
                                if (str2.length() == 0) {
                                    throw new NoSuchElementException("Char sequence is empty.");
                                }
                                if (str2.charAt(0) == '\"' && kotlin.text.o.s0(str2) == '\"') {
                                    int i14 = 1;
                                    while (true) {
                                        int iP = kotlin.text.n.P(str2, '\"', i14, false, 4);
                                        if (iP != kotlin.text.n.N(str2)) {
                                            int i15 = 0;
                                            for (int i16 = iP - 1; str2.charAt(i16) == '\\'; i16--) {
                                                i15++;
                                            }
                                            if (i15 % i12 == 0) {
                                                length2 = str2.length();
                                                i11 = 0;
                                                while (true) {
                                                    if (i11 < length2) {
                                                        if (io.ktor.http.f.f40478a.contains(Character.valueOf(str2.charAt(i11)))) {
                                                            sb2 = new StringBuilder("\"");
                                                            length = str2.length();
                                                            while (i10 < length) {
                                                                cCharAt = str2.charAt(i10);
                                                                if (cCharAt == '\\') {
                                                                    sb2.append("\\\\");
                                                                } else if (cCharAt == '\n') {
                                                                    sb2.append("\\n");
                                                                } else if (cCharAt == '\r') {
                                                                    sb2.append("\\r");
                                                                } else if (cCharAt == '\t') {
                                                                    sb2.append("\\t");
                                                                } else if (cCharAt == '\"') {
                                                                    sb2.append("\\\"");
                                                                } else {
                                                                    sb2.append(cCharAt);
                                                                }
                                                            }
                                                            sb2.append("\"");
                                                            String string2 = sb2.toString();
                                                            kotlin.jvm.internal.i.d(string2, "StringBuilder().apply(builderAction).toString()");
                                                            sb3.append(string2);
                                                        } else {
                                                            i11++;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i14 = iP + 1;
                                                if (i14 >= str2.length()) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    length2 = str2.length();
                                    i11 = 0;
                                    while (true) {
                                        if (i11 < length2) {
                                            if (io.ktor.http.f.f40478a.contains(Character.valueOf(str2.charAt(i11)))) {
                                                sb2 = new StringBuilder("\"");
                                                length = str2.length();
                                                while (i10 < length) {
                                                    cCharAt = str2.charAt(i10);
                                                    if (cCharAt == '\\') {
                                                        sb2.append("\\\\");
                                                    } else if (cCharAt == '\n') {
                                                        sb2.append("\\n");
                                                    } else if (cCharAt == '\r') {
                                                        sb2.append("\\r");
                                                    } else if (cCharAt == '\t') {
                                                        sb2.append("\\t");
                                                    } else if (cCharAt == '\"') {
                                                        sb2.append("\\\"");
                                                    } else {
                                                        sb2.append(cCharAt);
                                                    }
                                                }
                                                sb2.append("\"");
                                                String string3 = sb2.toString();
                                                kotlin.jvm.internal.i.d(string3, "StringBuilder().apply(builderAction).toString()");
                                                sb3.append(string3);
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                }
                            }
                            sb3.append(str2);
                        } else {
                            sb2 = new StringBuilder("\"");
                            length = str2.length();
                            while (i10 < length) {
                                cCharAt = str2.charAt(i10);
                                if (cCharAt == '\\') {
                                    sb2.append("\\\\");
                                } else if (cCharAt == '\n') {
                                    sb2.append("\\n");
                                } else if (cCharAt == '\r') {
                                    sb2.append("\\r");
                                } else if (cCharAt == '\t') {
                                    sb2.append("\\t");
                                } else if (cCharAt == '\"') {
                                    sb2.append("\\\"");
                                } else {
                                    sb2.append(cCharAt);
                                }
                            }
                            sb2.append("\"");
                            String string4 = sb2.toString();
                            kotlin.jvm.internal.i.d(string4, "StringBuilder().apply(builderAction).toString()");
                            sb3.append(string4);
                        }
                        if (i13 != iR) {
                            i13++;
                            i12 = 2;
                        }
                    }
                }
                String string5 = sb3.toString();
                kotlin.jvm.internal.i.d(string5, "{\n            val size =…   }.toString()\n        }");
                return string5;
            default:
                return super.toString();
        }
    }

    public H() {
        this.f9361a = 1;
        this.f9363c = new int[2];
    }

    public H(Object obj, InterfaceC0921v interfaceC0921v) {
        this.f9361a = 0;
        this.f9362b = obj;
        this.f9363c = interfaceC0921v;
    }
}
