package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.SaversKt;
import java.util.List;

/* JADX INFO: compiled from: TextFieldValue.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldValue {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W.f f15490d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1260a f15491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.ui.text.E f15493c;

    static {
        W.f fVar = SaverKt.f13134a;
        f15490d = new W.f(new Ia.p<androidx.compose.runtime.saveable.j, TextFieldValue, Object>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1
            @Override // Ia.p
            public final Object invoke(androidx.compose.runtime.saveable.j jVar, TextFieldValue textFieldValue) {
                androidx.compose.runtime.saveable.j jVar2 = jVar;
                TextFieldValue textFieldValue2 = textFieldValue;
                return kotlin.collections.l.n(SaversKt.a(textFieldValue2.f15491a, SaversKt.f15329a, jVar2), SaversKt.a(new androidx.compose.ui.text.E(textFieldValue2.f15492b), SaversKt.f15343p, jVar2));
            }
        }, new Ia.l<Object, TextFieldValue>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2
            @Override // Ia.l
            public final TextFieldValue invoke(Object obj) {
                kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                W.f fVar2 = SaversKt.f15329a;
                Boolean bool = Boolean.FALSE;
                C1260a c1260a = (kotlin.jvm.internal.i.a(obj2, bool) || obj2 == null) ? null : (C1260a) ((Ia.l) fVar2.f6997c).invoke(obj2);
                kotlin.jvm.internal.i.b(c1260a);
                Object obj3 = list.get(1);
                int i10 = androidx.compose.ui.text.E.f15315c;
                androidx.compose.ui.text.E e10 = (kotlin.jvm.internal.i.a(obj3, bool) || obj3 == null) ? null : (androidx.compose.ui.text.E) ((Ia.l) SaversKt.f15343p.f6997c).invoke(obj3);
                kotlin.jvm.internal.i.b(e10);
                return new TextFieldValue(c1260a, e10.f15316a, (androidx.compose.ui.text.E) null);
            }
        });
    }

    public TextFieldValue(C1260a c1260a, long j, androidx.compose.ui.text.E e10) {
        this.f15491a = c1260a;
        this.f15492b = O.h.f(c1260a.f15408c.length(), j);
        this.f15493c = e10 != null ? new androidx.compose.ui.text.E(O.h.f(c1260a.f15408c.length(), e10.f15316a)) : null;
    }

    public static TextFieldValue a(TextFieldValue textFieldValue, C1260a c1260a, long j, int i10) {
        if ((i10 & 1) != 0) {
            c1260a = textFieldValue.f15491a;
        }
        if ((i10 & 2) != 0) {
            j = textFieldValue.f15492b;
        }
        androidx.compose.ui.text.E e10 = (i10 & 4) != 0 ? textFieldValue.f15493c : null;
        textFieldValue.getClass();
        return new TextFieldValue(c1260a, j, e10);
    }

    public static TextFieldValue b(TextFieldValue textFieldValue, String str, long j, int i10) {
        if ((i10 & 2) != 0) {
            j = textFieldValue.f15492b;
        }
        androidx.compose.ui.text.E e10 = textFieldValue.f15493c;
        textFieldValue.getClass();
        return new TextFieldValue(new C1260a(str), j, e10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        return androidx.compose.ui.text.E.a(this.f15492b, textFieldValue.f15492b) && kotlin.jvm.internal.i.a(this.f15493c, textFieldValue.f15493c) && kotlin.jvm.internal.i.a(this.f15491a, textFieldValue.f15491a);
    }

    public final int hashCode() {
        int iHashCode = this.f15491a.hashCode() * 31;
        int i10 = androidx.compose.ui.text.E.f15315c;
        int iC = C4.b.c(this.f15492b, iHashCode, 31);
        androidx.compose.ui.text.E e10 = this.f15493c;
        return iC + (e10 != null ? Long.hashCode(e10.f15316a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f15491a) + "', selection=" + ((Object) androidx.compose.ui.text.E.g(this.f15492b)) + ", composition=" + this.f15493c + ')';
    }

    public TextFieldValue(int i10, long j, String str) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? androidx.compose.ui.text.E.f15314b : j, (androidx.compose.ui.text.E) null);
    }

    public TextFieldValue(String str, long j, androidx.compose.ui.text.E e10) {
        this(new C1260a(str), j, e10);
    }
}
