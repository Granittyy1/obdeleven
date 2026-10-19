package O;

import android.view.KeyEvent;

/* JADX INFO: compiled from: KeyEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyEvent f4721a;

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return kotlin.jvm.internal.i.a(this.f4721a, ((c) obj).f4721a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4721a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f4721a + ')';
    }
}
