package androidx.compose.ui.text.input;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: RecordingInputConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@p293xa.d
public final class u implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.foundation.gestures.snapping.c f15565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextFieldValue f15568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f15571g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15572h = true;

    public u(TextFieldValue textFieldValue, androidx.compose.foundation.gestures.snapping.c cVar, boolean z10) {
        this.f15565a = cVar;
        this.f15566b = z10;
        this.f15568d = textFieldValue;
    }

    public final void b(g gVar) {
        this.f15567c++;
        try {
            this.f15571g.add(gVar);
        } finally {
            c();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z10 = this.f15572h;
        if (!z10) {
            return z10;
        }
        this.f15567c++;
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    public final boolean c() {
        int i10 = this.f15567c - 1;
        this.f15567c = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f15571g;
            if (!arrayList.isEmpty()) {
                ((TextInputServiceAndroid) this.f15565a.f10039b).f15500e.invoke(kotlin.collections.q.p0(arrayList));
                arrayList.clear();
            }
        }
        return this.f15567c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f15572h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f15571g.clear();
        this.f15567c = 0;
        this.f15572h = false;
        TextInputServiceAndroid textInputServiceAndroid = (TextInputServiceAndroid) this.f15565a.f10039b;
        int size = textInputServiceAndroid.f15504i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (kotlin.jvm.internal.i.a(((WeakReference) textInputServiceAndroid.f15504i.get(i10)).get(), this)) {
                textInputServiceAndroid.f15504i.remove(i10);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f15572h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f15572h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f15572h;
        return z10 ? this.f15566b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f15572h;
        if (z10) {
            b(new C1269a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    public final void d(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f15572h;
        if (!z10) {
            return z10;
        }
        b(new C1273e(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f15572h;
        if (!z10) {
            return z10;
        }
        b(new f(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return c();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z10 = this.f15572h;
        if (!z10) {
            return z10;
        }
        b(new j());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        TextFieldValue textFieldValue = this.f15568d;
        return TextUtils.getCapsMode(textFieldValue.f15491a.f15408c, androidx.compose.ui.text.E.e(textFieldValue.f15492b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f15570f = z10;
        if (z10) {
            this.f15569e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return com.voltasit.obdeleven.domain.usecases.device.v.h(this.f15568d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (androidx.compose.ui.text.E.b(this.f15568d.f15492b)) {
            return null;
        }
        return kotlinx.coroutines.C.o(this.f15568d).f15408c;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return kotlinx.coroutines.C.p(this.f15568d, i10).f15408c;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return kotlinx.coroutines.C.q(this.f15568d, i10).f15408c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z10 = this.f15572h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    b(new x(0, this.f15568d.f15491a.f15408c.length()));
                    break;
                case R.id.cut:
                    d(277);
                    break;
                case R.id.copy:
                    d(278);
                    break;
                case R.id.paste:
                    d(279);
                    break;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000a  */
    /* JADX WARN: Type inference failed for: r1v3, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.f15572h;
        if (z10) {
            z10 = true;
            if (i10 != 0) {
                switch (i10) {
                    case 2:
                        i11 = 2;
                        break;
                    case 3:
                        i11 = 3;
                        break;
                    case 4:
                        i11 = 4;
                        break;
                    case 5:
                        i11 = 6;
                        break;
                    case 6:
                        i11 = 7;
                        break;
                    case 7:
                        i11 = 5;
                        break;
                    default:
                        i11 = 1;
                        break;
                }
            } else {
                i11 = 1;
            }
            ((TextInputServiceAndroid) this.f15565a.f10039b).f15501f.invoke(new k(i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f15572h;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = this.f15572h;
        if (!z13) {
            return z13;
        }
        boolean z14 = false;
        boolean z15 = (i10 & 1) != 0;
        boolean z16 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            z10 = (i10 & 16) != 0;
            z11 = (i10 & 8) != 0;
            boolean z17 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z14 = true;
            }
            if (z10 || z11 || z17 || z14) {
                z12 = z14;
                z14 = z17;
            } else if (i11 >= 34) {
                z12 = true;
                z14 = true;
                z10 = true;
                z11 = true;
            } else {
                z10 = true;
                z11 = true;
                z12 = z14;
                z14 = true;
            }
        } else {
            z10 = true;
            z11 = true;
            z12 = false;
        }
        C1271c c1271c = ((TextInputServiceAndroid) this.f15565a.f10039b).f15506l;
        synchronized (c1271c.f15522c) {
            try {
                c1271c.f15525f = z10;
                c1271c.f15526g = z11;
                c1271c.f15527h = z14;
                c1271c.f15528i = z12;
                if (z15) {
                    c1271c.f15524e = true;
                    if (c1271c.j != null) {
                        c1271c.a();
                    }
                }
                c1271c.f15523d = z16;
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, xa.g] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f15572h;
        if (!z10) {
            return z10;
        }
        ((BaseInputConnection) ((TextInputServiceAndroid) this.f15565a.f10039b).j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f15572h;
        if (z10) {
            b(new v(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f15572h;
        if (z10) {
            b(new w(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z10 = this.f15572h;
        if (!z10) {
            return z10;
        }
        b(new x(i10, i11));
        return true;
    }
}
