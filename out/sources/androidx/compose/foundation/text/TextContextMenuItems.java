package androidx.compose.foundation.text;

import android.R;
import android.os.Build;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 androidx.compose.foundation.text.TextContextMenuItems[], still in use, count: 1, list:
  (r0v1 androidx.compose.foundation.text.TextContextMenuItems[]) from 0x0051: INVOKE (r0v1 androidx.compose.foundation.text.TextContextMenuItems[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:82)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: ContextMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextContextMenuItems {
    Cut(R.string.cut),
    Copy(R.string.copy),
    Paste(R.string.paste),
    SelectAll(R.string.selectAll),
    Autofill(Build.VERSION.SDK_INT <= 26 ? com.voltasit.obdeleven.R.string.autofill : R.string.autofill);

    private final int stringId;

    static {
        kotlin.enums.a.a(textContextMenuItemsArr);
    }

    public TextContextMenuItems(int i10) {
        super(str, i);
        this.stringId = i10;
    }

    public static TextContextMenuItems valueOf(String str) {
        return (TextContextMenuItems) Enum.valueOf(TextContextMenuItems.class, str);
    }

    public static TextContextMenuItems[] values() {
        return (TextContextMenuItems[]) f11209g.clone();
    }

    public final String a(InterfaceC1084f interfaceC1084f) {
        return S4.o.p(interfaceC1084f, this.stringId);
    }
}
