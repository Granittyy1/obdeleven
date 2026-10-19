package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;

/* JADX INFO: compiled from: UndoManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f11103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f11104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f11106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11107f;

    /* JADX INFO: compiled from: UndoManager.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f11108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextFieldValue f11109b;

        public a(a aVar, TextFieldValue textFieldValue) {
            this.f11108a = aVar;
            this.f11109b = textFieldValue;
        }
    }

    public G() {
        this(0);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    public final void a(TextFieldValue textFieldValue) {
        a aVar;
        TextFieldValue textFieldValue2;
        this.f11107f = false;
        a aVar2 = this.f11103b;
        if (kotlin.jvm.internal.i.a(textFieldValue, aVar2 != null ? aVar2.f11109b : null)) {
            return;
        }
        String str = textFieldValue.f15491a.f15408c;
        a aVar3 = this.f11103b;
        if (kotlin.jvm.internal.i.a(str, (aVar3 == null || (textFieldValue2 = aVar3.f11109b) == null) ? null : textFieldValue2.f15491a.f15408c)) {
            a aVar4 = this.f11103b;
            if (aVar4 == null) {
                return;
            }
            aVar4.f11109b = textFieldValue;
            return;
        }
        this.f11103b = new a(this.f11103b, textFieldValue);
        this.f11104c = null;
        int length = textFieldValue.f15491a.f15408c.length() + this.f11105d;
        this.f11105d = length;
        if (length > this.f11102a) {
            a aVar5 = this.f11103b;
            if ((aVar5 != null ? aVar5.f11108a : null) == null) {
                return;
            }
            while (true) {
                if (aVar5 == null) {
                    aVar = null;
                } else {
                    a aVar6 = aVar5.f11108a;
                    if (aVar6 != null) {
                        aVar = aVar6.f11108a;
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    break;
                } else {
                    aVar5 = aVar5.f11108a;
                }
            }
            if (aVar5 == null) {
                return;
            }
            aVar5.f11108a = null;
        }
    }

    public G(int i10) {
        this.f11102a = 100000;
    }
}
