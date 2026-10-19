package N0;

import M0.f;
import N8.e;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.TextView;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: TextViewBindingAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static void a(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (!(charSequence instanceof Spanned)) {
                if ((charSequence == null) == (text == null)) {
                    if (charSequence == null) {
                        return;
                    }
                    int length = charSequence.length();
                    if (length == text.length()) {
                        for (int i10 = 0; i10 < length; i10++) {
                            if (charSequence.charAt(i10) == text.charAt(i10)) {
                            }
                        }
                        return;
                    }
                }
            } else if (charSequence.equals(text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    public static void b(TextView textView, e eVar, f fVar) {
        TextWatcher bVar = (eVar == null && fVar == null) ? null : new b(eVar, fVar);
        int i10 = a.f4620a;
        Object tag = textView.getTag(R.id.textWatcher);
        textView.setTag(R.id.textWatcher, bVar);
        TextWatcher textWatcher = (TextWatcher) tag;
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (bVar != null) {
            textView.addTextChangedListener(bVar);
        }
    }
}
