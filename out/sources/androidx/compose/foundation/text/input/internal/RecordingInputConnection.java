package androidx.compose.foundation.text.input.internal;

import V.C0818a;
import V.C0820c;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.graphics.g0;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.platform.Y0;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.C1268i;
import androidx.compose.ui.text.input.C1269a;
import androidx.compose.ui.text.input.C1273e;
import androidx.compose.ui.text.input.TextFieldValue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.Regex;

/* JADX INFO: compiled from: RecordingInputConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RecordingInputConnection implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y.a f11298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LegacyTextFieldState f11300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextFieldSelectionManager f11301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Y0 f11302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextFieldValue f11304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11306i;
    public final ArrayList j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11307k = true;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.RecordingInputConnection$performHandwritingGesture$1, reason: invalid class name */
    /* JADX INFO: compiled from: RecordingInputConnection.android.kt */
    public static final class AnonymousClass1 extends Lambda implements Ia.l<androidx.compose.ui.text.input.g, p293xa.r> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // Ia.l
        public final p293xa.r invoke(androidx.compose.ui.text.input.g gVar) {
            RecordingInputConnection.this.b(gVar);
            return p293xa.r.f47939a;
        }
    }

    public RecordingInputConnection(TextFieldValue textFieldValue, Y.a aVar, boolean z10, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, Y0 y10) {
        this.f11298a = aVar;
        this.f11299b = z10;
        this.f11300c = legacyTextFieldState;
        this.f11301d = textFieldSelectionManager;
        this.f11302e = y10;
        this.f11304g = textFieldValue;
    }

    public final void b(androidx.compose.ui.text.input.g gVar) {
        this.f11303f++;
        try {
            this.j.add(gVar);
        } finally {
            c();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z10 = this.f11307k;
        if (!z10) {
            return z10;
        }
        this.f11303f++;
        return true;
    }

    public final boolean c() {
        int i10 = this.f11303f - 1;
        this.f11303f = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                Y.this.f11331c.invoke(kotlin.collections.q.p0(arrayList));
                arrayList.clear();
            }
        }
        return this.f11303f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f11307k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f11303f = 0;
        this.f11307k = false;
        Y y10 = Y.this;
        int size = y10.j.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (kotlin.jvm.internal.i.a(((WeakReference) y10.j.get(i10)).get(), this)) {
                y10.j.remove(i10);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f11307k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f11307k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f11307k;
        return z10 ? this.f11299b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f11307k;
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
        boolean z10 = this.f11307k;
        if (!z10) {
            return z10;
        }
        b(new C1273e(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f11307k;
        if (!z10) {
            return z10;
        }
        b(new androidx.compose.ui.text.input.f(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return c();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z10 = this.f11307k;
        if (!z10) {
            return z10;
        }
        b(new androidx.compose.ui.text.input.j());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        TextFieldValue textFieldValue = this.f11304g;
        return TextUtils.getCapsMode(textFieldValue.f15491a.f15408c, androidx.compose.ui.text.E.e(textFieldValue.f15492b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f11306i = z10;
        if (z10) {
            this.f11305h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return H3.c.b(this.f11304g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (androidx.compose.ui.text.E.b(this.f11304g.f15492b)) {
            return null;
        }
        return kotlinx.coroutines.C.o(this.f11304g).f15408c;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return kotlinx.coroutines.C.p(this.f11304g, i10).f15408c;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return kotlinx.coroutines.C.q(this.f11304g, i10).f15408c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z10 = this.f11307k;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    b(new androidx.compose.ui.text.input.x(0, this.f11304g.f15491a.f15408c.length()));
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
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.f11307k;
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
            Y.this.f11332d.invoke(new androidx.compose.ui.text.input.k(i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, final IntConsumer intConsumer) {
        C1260a c1260a;
        long jH;
        int i10;
        String string;
        int i11;
        int iA;
        androidx.compose.foundation.text.A aD;
        androidx.compose.ui.text.B b10;
        int iA2;
        androidx.compose.foundation.text.A aD2;
        androidx.compose.ui.text.B b11;
        androidx.compose.ui.text.B b12;
        androidx.compose.ui.text.A a10;
        int iA3 = 2;
        if (Build.VERSION.SDK_INT >= 34) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            LegacyTextFieldState legacyTextFieldState = this.f11300c;
            final int i12 = 3;
            if (legacyTextFieldState != null && (c1260a = legacyTextFieldState.j) != null) {
                androidx.compose.foundation.text.A aD3 = legacyTextFieldState.d();
                if (c1260a.equals((aD3 == null || (b12 = aD3.f11055a) == null || (a10 = b12.f15300a) == null) ? null : a10.f15276a)) {
                    boolean zA = r.a(handwritingGesture);
                    TextFieldSelectionManager textFieldSelectionManager = this.f11301d;
                    if (zA) {
                        SelectGesture selectGestureB = C0820c.b(handwritingGesture);
                        long jF = Q.f(legacyTextFieldState, g0.e(selectGestureB.getSelectionArea()), selectGestureB.getGranularity() == 1 ? 1 : 0);
                        if (androidx.compose.ui.text.E.b(jF)) {
                            iA3 = O.a(D.b(selectGestureB), anonymousClass1);
                        } else {
                            anonymousClass1.invoke(new androidx.compose.ui.text.input.x((int) (jF >> 32), (int) (jF & 4294967295L)));
                            if (textFieldSelectionManager != null) {
                                textFieldSelectionManager.g(true);
                            }
                            iA3 = 1;
                        }
                    } else if (J.a(handwritingGesture)) {
                        DeleteGesture deleteGestureA = L.a(handwritingGesture);
                        int i13 = deleteGestureA.getGranularity() != 1 ? 0 : 1;
                        long jF2 = Q.f(legacyTextFieldState, g0.e(deleteGestureA.getDeletionArea()), i13);
                        if (androidx.compose.ui.text.E.b(jF2)) {
                            iA3 = O.a(D.b(deleteGestureA), anonymousClass1);
                        } else {
                            O.b(jF2, c1260a, i13 == 1, anonymousClass1);
                            iA3 = 1;
                        }
                    } else if (M.b(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureA = C1008h.a(handwritingGesture);
                        long jB = Q.b(legacyTextFieldState, g0.e(selectRangeGestureA.getSelectionStartArea()), g0.e(selectRangeGestureA.getSelectionEndArea()), selectRangeGestureA.getGranularity() == 1 ? 1 : 0);
                        if (androidx.compose.ui.text.E.b(jB)) {
                            iA3 = O.a(D.b(selectRangeGestureA), anonymousClass1);
                        } else {
                            anonymousClass1.invoke(new androidx.compose.ui.text.input.x((int) (jB >> 32), (int) (jB & 4294967295L)));
                            if (textFieldSelectionManager != null) {
                                textFieldSelectionManager.g(true);
                            }
                            iA3 = 1;
                        }
                    } else if (C1009i.c(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureA = C1010j.a(handwritingGesture);
                        int i14 = deleteRangeGestureA.getGranularity() != 1 ? 0 : 1;
                        long jB2 = Q.b(legacyTextFieldState, g0.e(deleteRangeGestureA.getDeletionStartArea()), g0.e(deleteRangeGestureA.getDeletionEndArea()), i14);
                        if (androidx.compose.ui.text.E.b(jB2)) {
                            iA3 = O.a(D.b(deleteRangeGestureA), anonymousClass1);
                        } else {
                            O.b(jB2, c1260a, i14 == 1, anonymousClass1);
                            iA3 = 1;
                        }
                    } else {
                        boolean zA2 = z.a(handwritingGesture);
                        Y0 y10 = this.f11302e;
                        if (zA2) {
                            JoinOrSplitGesture joinOrSplitGestureB = C0818a.b(handwritingGesture);
                            if (y10 == null || (iA2 = Q.a(legacyTextFieldState, Q.d(joinOrSplitGestureB.getJoinOrSplitPoint()), y10)) == -1 || ((aD2 = legacyTextFieldState.d()) != null && (b11 = aD2.f11055a) != null && Q.c(b11, iA2))) {
                                iA3 = O.a(D.b(joinOrSplitGestureB), anonymousClass1);
                            } else {
                                int iCharCount = iA2;
                                while (iCharCount > 0) {
                                    int iCodePointBefore = Character.codePointBefore(c1260a, iCharCount);
                                    if (!Q.h(iCodePointBefore)) {
                                        break;
                                    } else {
                                        iCharCount -= Character.charCount(iCodePointBefore);
                                    }
                                }
                                while (iA2 < c1260a.f15408c.length()) {
                                    int iCodePointAt = Character.codePointAt(c1260a, iA2);
                                    if (!Q.h(iCodePointAt)) {
                                        break;
                                    } else {
                                        iA2 += Character.charCount(iCodePointAt);
                                    }
                                }
                                long jB3 = O.h.b(iCharCount, iA2);
                                if (androidx.compose.ui.text.E.b(jB3)) {
                                    int i15 = (int) (jB3 >> 32);
                                    anonymousClass1.invoke(new P(new androidx.compose.ui.text.input.g[]{new androidx.compose.ui.text.input.x(i15, i15), new C1269a(" ", 1)}));
                                } else {
                                    O.b(jB3, c1260a, false, anonymousClass1);
                                }
                                iA3 = 1;
                            }
                        } else if (C1021v.c(handwritingGesture)) {
                            InsertGesture insertGestureB = C1022w.b(handwritingGesture);
                            if (y10 == null || (iA = Q.a(legacyTextFieldState, Q.d(insertGestureB.getInsertionPoint()), y10)) == -1 || ((aD = legacyTextFieldState.d()) != null && (b10 = aD.f11055a) != null && Q.c(b10, iA))) {
                                iA3 = O.a(D.b(insertGestureB), anonymousClass1);
                            } else {
                                anonymousClass1.invoke(new P(new androidx.compose.ui.text.input.g[]{new androidx.compose.ui.text.input.x(iA, iA), new C1269a(insertGestureB.getTextToInsert(), 1)}));
                                iA3 = 1;
                            }
                        } else if (C1023x.a(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureA = C1024y.a(handwritingGesture);
                            androidx.compose.foundation.text.A aD4 = legacyTextFieldState.d();
                            androidx.compose.ui.text.B b13 = aD4 != null ? aD4.f11055a : null;
                            long jD = Q.d(removeSpaceGestureA.getStartPoint());
                            long jD2 = Q.d(removeSpaceGestureA.getEndPoint());
                            InterfaceC1170p interfaceC1170pC = legacyTextFieldState.c();
                            if (b13 == null || interfaceC1170pC == null) {
                                jH = androidx.compose.ui.text.E.f15314b;
                            } else {
                                long jC0 = interfaceC1170pC.c0(jD);
                                long jC1 = interfaceC1170pC.c0(jD2);
                                C1268i c1268i = b13.f15301b;
                                int iE = Q.e(c1268i, jC0, y10);
                                int iE2 = Q.e(c1268i, jC1, y10);
                                if (iE != -1) {
                                    if (iE2 != -1) {
                                        iE = Math.min(iE, iE2);
                                    }
                                    iE2 = iE;
                                } else if (iE2 == -1) {
                                    jH = androidx.compose.ui.text.E.f15314b;
                                }
                                float fB = (c1268i.b(iE2) + c1268i.f(iE2)) / 2;
                                int i16 = (int) (jC0 >> 32);
                                int i17 = (int) (jC1 >> 32);
                                jH = c1268i.h(new I.f(Math.min(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17)), fB - 0.1f, Math.max(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17)), fB + 0.1f), 0, androidx.compose.ui.text.y.a.f15710a);
                            }
                            if (androidx.compose.ui.text.E.b(jH)) {
                                iA3 = O.a(D.b(removeSpaceGestureA), anonymousClass1);
                            } else {
                                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                                ref$IntRef.element = -1;
                                final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                                ref$IntRef2.element = -1;
                                C1260a c1260aSubSequence = c1260a.subSequence(androidx.compose.ui.text.E.e(jH), androidx.compose.ui.text.E.d(jH));
                                Regex regex = new Regex("\\s+");
                                Ia.l<kotlin.text.f, CharSequence> lVar = new Ia.l<kotlin.text.f, CharSequence>() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final CharSequence invoke(kotlin.text.f fVar) {
                                        kotlin.text.f fVar2 = fVar;
                                        Ref$IntRef ref$IntRef3 = ref$IntRef;
                                        if (ref$IntRef3.element == -1) {
                                            ref$IntRef3.element = fVar2.a().f4687b;
                                        }
                                        ref$IntRef2.element = fVar2.a().f4688c + 1;
                                        return "";
                                    }
                                };
                                String input = c1260aSubSequence.f15408c;
                                kotlin.jvm.internal.i.e(input, "input");
                                kotlin.text.g gVarB = Regex.b(regex, input);
                                if (gVarB == null) {
                                    string = input.toString();
                                } else {
                                    int length = input.length();
                                    StringBuilder sb2 = new StringBuilder(length);
                                    kotlin.text.g gVar = gVarB;
                                    int i18 = 0;
                                    while (true) {
                                        sb2.append((CharSequence) input, i18, gVar.a().f4687b);
                                        kotlin.text.g gVar2 = gVar;
                                        lVar.invoke(gVar2);
                                        sb2.append((CharSequence) "");
                                        i10 = gVar2.a().f4688c + 1;
                                        kotlin.text.g gVarB2 = gVar2.b();
                                        if (i10 >= length || gVarB2 == null) {
                                            break;
                                        }
                                        gVar = gVarB2;
                                        i18 = i10;
                                    }
                                    if (i10 < length) {
                                        sb2.append((CharSequence) input, i10, length);
                                    }
                                    string = sb2.toString();
                                    kotlin.jvm.internal.i.d(string, "toString(...)");
                                }
                                int i19 = ref$IntRef.element;
                                if (i19 == -1 || (i11 = ref$IntRef2.element) == -1) {
                                    iA3 = O.a(D.b(removeSpaceGestureA), anonymousClass1);
                                } else {
                                    int i20 = (int) (jH >> 32);
                                    String strSubstring = string.substring(i19, string.length() - (androidx.compose.ui.text.E.c(jH) - ref$IntRef2.element));
                                    kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
                                    anonymousClass1.invoke(new P(new androidx.compose.ui.text.input.g[]{new androidx.compose.ui.text.input.x(i20 + i19, i20 + i11), new C1269a(strSubstring, 1)}));
                                    iA3 = 1;
                                }
                            }
                        }
                    }
                    i12 = iA3;
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new Runnable() { // from class: androidx.compose.foundation.text.input.internal.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        intConsumer.accept(i12);
                    }
                });
            } else {
                intConsumer.accept(i12);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f11307k;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        LegacyTextFieldState legacyTextFieldState;
        C1260a c1260a;
        androidx.compose.ui.text.B b10;
        androidx.compose.ui.text.A a10;
        if (Build.VERSION.SDK_INT < 34 || (legacyTextFieldState = this.f11300c) == null || (c1260a = legacyTextFieldState.j) == null) {
            return false;
        }
        androidx.compose.foundation.text.A aD = legacyTextFieldState.d();
        if (!c1260a.equals((aD == null || (b10 = aD.f11055a) == null || (a10 = b10.f15300a) == null) ? null : a10.f15276a)) {
            return false;
        }
        boolean zA = r.a(previewableHandwritingGesture);
        final TextFieldSelectionManager textFieldSelectionManager = this.f11301d;
        if (zA) {
            SelectGesture selectGestureB = C0820c.b(previewableHandwritingGesture);
            if (textFieldSelectionManager != null) {
                long jF = Q.f(legacyTextFieldState, g0.e(selectGestureB.getSelectionArea()), selectGestureB.getGranularity() != 1 ? 0 : 1);
                LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.f11555d;
                if (legacyTextFieldState2 != null) {
                    legacyTextFieldState2.f(jF);
                }
                LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.f11555d;
                if (legacyTextFieldState3 != null) {
                    legacyTextFieldState3.e(androidx.compose.ui.text.E.f15314b);
                }
                if (!androidx.compose.ui.text.E.b(jF)) {
                    textFieldSelectionManager.r(false);
                    textFieldSelectionManager.p(HandleState.f11117b);
                }
            }
        } else if (J.a(previewableHandwritingGesture)) {
            DeleteGesture deleteGestureA = L.a(previewableHandwritingGesture);
            if (textFieldSelectionManager != null) {
                long jF2 = Q.f(legacyTextFieldState, g0.e(deleteGestureA.getDeletionArea()), deleteGestureA.getGranularity() != 1 ? 0 : 1);
                LegacyTextFieldState legacyTextFieldState4 = textFieldSelectionManager.f11555d;
                if (legacyTextFieldState4 != null) {
                    legacyTextFieldState4.e(jF2);
                }
                LegacyTextFieldState legacyTextFieldState5 = textFieldSelectionManager.f11555d;
                if (legacyTextFieldState5 != null) {
                    legacyTextFieldState5.f(androidx.compose.ui.text.E.f15314b);
                }
                if (!androidx.compose.ui.text.E.b(jF2)) {
                    textFieldSelectionManager.r(false);
                    textFieldSelectionManager.p(HandleState.f11117b);
                }
            }
        } else if (M.b(previewableHandwritingGesture)) {
            SelectRangeGesture selectRangeGestureA = C1008h.a(previewableHandwritingGesture);
            if (textFieldSelectionManager != null) {
                long jB = Q.b(legacyTextFieldState, g0.e(selectRangeGestureA.getSelectionStartArea()), g0.e(selectRangeGestureA.getSelectionEndArea()), selectRangeGestureA.getGranularity() != 1 ? 0 : 1);
                LegacyTextFieldState legacyTextFieldState6 = textFieldSelectionManager.f11555d;
                if (legacyTextFieldState6 != null) {
                    legacyTextFieldState6.f(jB);
                }
                LegacyTextFieldState legacyTextFieldState7 = textFieldSelectionManager.f11555d;
                if (legacyTextFieldState7 != null) {
                    legacyTextFieldState7.e(androidx.compose.ui.text.E.f15314b);
                }
                if (!androidx.compose.ui.text.E.b(jB)) {
                    textFieldSelectionManager.r(false);
                    textFieldSelectionManager.p(HandleState.f11117b);
                }
            }
        } else {
            if (!C1009i.c(previewableHandwritingGesture)) {
                return false;
            }
            DeleteRangeGesture deleteRangeGestureA = C1010j.a(previewableHandwritingGesture);
            if (textFieldSelectionManager != null) {
                long jB2 = Q.b(legacyTextFieldState, g0.e(deleteRangeGestureA.getDeletionStartArea()), g0.e(deleteRangeGestureA.getDeletionEndArea()), deleteRangeGestureA.getGranularity() != 1 ? 0 : 1);
                LegacyTextFieldState legacyTextFieldState8 = textFieldSelectionManager.f11555d;
                if (legacyTextFieldState8 != null) {
                    legacyTextFieldState8.e(jB2);
                }
                LegacyTextFieldState legacyTextFieldState9 = textFieldSelectionManager.f11555d;
                if (legacyTextFieldState9 != null) {
                    legacyTextFieldState9.f(androidx.compose.ui.text.E.f15314b);
                }
                if (!androidx.compose.ui.text.E.b(jB2)) {
                    textFieldSelectionManager.r(false);
                    textFieldSelectionManager.p(HandleState.f11117b);
                }
            }
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.N
                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                    if (textFieldSelectionManager2 != null) {
                        LegacyTextFieldState legacyTextFieldState10 = textFieldSelectionManager2.f11555d;
                        if (legacyTextFieldState10 != null) {
                            legacyTextFieldState10.e(androidx.compose.ui.text.E.f15314b);
                        }
                        LegacyTextFieldState legacyTextFieldState11 = textFieldSelectionManager2.f11555d;
                        if (legacyTextFieldState11 == null) {
                            return;
                        }
                        legacyTextFieldState11.f(androidx.compose.ui.text.E.f15314b);
                    }
                }
            });
        }
        return true;
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
        boolean z13 = this.f11307k;
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
        W w3 = Y.this.f11340m;
        synchronized (w3.f11314c) {
            try {
                w3.f11317f = z10;
                w3.f11318g = z11;
                w3.f11319h = z14;
                w3.f11320i = z12;
                if (z15) {
                    w3.f11316e = true;
                    if (w3.j != null) {
                        w3.a();
                    }
                }
                w3.f11315d = z16;
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, xa.g] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f11307k;
        if (!z10) {
            return z10;
        }
        ((BaseInputConnection) Y.this.f11338k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f11307k;
        if (z10) {
            b(new androidx.compose.ui.text.input.v(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f11307k;
        if (z10) {
            b(new androidx.compose.ui.text.input.w(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z10 = this.f11307k;
        if (!z10) {
            return z10;
        }
        b(new androidx.compose.ui.text.input.x(i10, i11));
        return true;
    }
}
