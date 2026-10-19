package kotlinx.datetime.internal.format;

import com.google.android.gms.internal.measurement.M1;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: compiled from: FormatStructure.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j<T> implements p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43890a;

    public j(String string) {
        kotlin.jvm.internal.i.e(string, "string");
        this.f43890a = string;
    }

    @Override // kotlinx.datetime.internal.format.n
    public final Wa.e<T> a() {
        return new Wa.c(this.f43890a);
    }

    @Override // kotlinx.datetime.internal.format.n
    public final kotlinx.datetime.internal.format.parser.l<T> b() {
        List listI;
        String strSubstring;
        String strSubstring2 = this.f43890a;
        if (strSubstring2.length() == 0) {
            listI = EmptyList.f42983b;
        } else {
            ListBuilder listBuilderF = M1.f();
            String strSubstring3 = "";
            if (Character.isDigit(strSubstring2.charAt(0))) {
                int length = strSubstring2.length();
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        strSubstring = strSubstring2;
                        break;
                    }
                    if (!Character.isDigit(strSubstring2.charAt(i10))) {
                        strSubstring = strSubstring2.substring(0, i10);
                        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
                        break;
                    }
                    i10++;
                }
                listBuilderF.add(new kotlinx.datetime.internal.format.parser.g(M1.k(new kotlinx.datetime.internal.format.parser.b(strSubstring))));
                int length2 = strSubstring2.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        strSubstring2 = "";
                        break;
                    }
                    if (!Character.isDigit(strSubstring2.charAt(i11))) {
                        strSubstring2 = strSubstring2.substring(i11);
                        kotlin.jvm.internal.i.d(strSubstring2, "substring(...)");
                        break;
                    }
                    i11++;
                }
            }
            if (strSubstring2.length() > 0) {
                if (Character.isDigit(strSubstring2.charAt(strSubstring2.length() - 1))) {
                    for (int iN = kotlin.text.n.N(strSubstring2); -1 < iN; iN--) {
                        if (!Character.isDigit(strSubstring2.charAt(iN))) {
                            strSubstring3 = strSubstring2.substring(0, iN + 1);
                            kotlin.jvm.internal.i.d(strSubstring3, "substring(...)");
                            break;
                        }
                    }
                    listBuilderF.add(new kotlinx.datetime.internal.format.parser.m(strSubstring3));
                    for (int iN2 = kotlin.text.n.N(strSubstring2); -1 < iN2; iN2--) {
                        if (!Character.isDigit(strSubstring2.charAt(iN2))) {
                            strSubstring2 = strSubstring2.substring(iN2 + 1);
                            kotlin.jvm.internal.i.d(strSubstring2, "substring(...)");
                            break;
                        }
                    }
                    listBuilderF.add(new kotlinx.datetime.internal.format.parser.g(M1.k(new kotlinx.datetime.internal.format.parser.b(strSubstring2))));
                } else {
                    listBuilderF.add(new kotlinx.datetime.internal.format.parser.m(strSubstring2));
                }
            }
            listI = listBuilderF.I();
        }
        return new kotlinx.datetime.internal.format.parser.l<>(listI, EmptyList.f42983b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (kotlin.jvm.internal.i.a(this.f43890a, ((j) obj).f43890a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43890a.hashCode();
    }

    public final String toString() {
        return B7.b.g(new StringBuilder("ConstantFormatStructure("), this.f43890a, ')');
    }
}
