package T0;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: EmojiTextWatcher.java */
/* JADX INFO: loaded from: classes.dex */
public final class g implements TextWatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EditText f5750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f5751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5752d = true;

    /* JADX INFO: compiled from: EmojiTextWatcher.java */
    public static class a extends androidx.emoji2.text.c.e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference f5753b;

        public a(EditText editText) {
            this.f5753b = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.c.e
        public final void b() {
            Handler handler;
            EditText editText = (EditText) this.f5753b.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.a((EditText) this.f5753b.get(), 1);
        }
    }

    public g(EditText editText) {
        this.f5750b = editText;
    }

    public static void a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.c cVarA = androidx.emoji2.text.c.a();
            if (editableText == null) {
                length = 0;
            } else {
                cVarA.getClass();
                length = editableText.length();
            }
            cVarA.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        EditText editText = this.f5750b;
        if (!editText.isInEditMode() && this.f5752d && androidx.emoji2.text.c.d() && i11 <= i12 && (charSequence instanceof Spannable)) {
            int iC = androidx.emoji2.text.c.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    androidx.emoji2.text.c.a().g(i10, i12 + i10, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            androidx.emoji2.text.c cVarA = androidx.emoji2.text.c.a();
            if (this.f5751c == null) {
                this.f5751c = new a(editText);
            }
            cVarA.h(this.f5751c);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
