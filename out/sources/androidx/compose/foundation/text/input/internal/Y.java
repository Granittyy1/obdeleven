package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.platform.InterfaceC1254x0;
import androidx.compose.ui.platform.Y0;
import androidx.compose.ui.text.input.TextFieldValue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Y implements InterfaceC1254x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f11329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputMethodManagerImpl f11330b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LegacyTextFieldState f11333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextFieldSelectionManager f11334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Y0 f11335g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Rect f11339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final W f11340m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ia.l<? super List<? extends androidx.compose.ui.text.input.g>, p293xa.r> f11331c = new Ia.l<List<? extends androidx.compose.ui.text.input.g>, p293xa.r>() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$onEditCommand$1
        @Override // Ia.l
        public final /* bridge */ /* synthetic */ p293xa.r invoke(List<? extends androidx.compose.ui.text.input.g> list) {
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ia.l<? super androidx.compose.ui.text.input.k, p293xa.r> f11332d = new Ia.l<androidx.compose.ui.text.input.k, p293xa.r>() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$onImeActionPerformed$1
        @Override // Ia.l
        public final /* synthetic */ p293xa.r invoke(androidx.compose.ui.text.input.k kVar) {
            int i10 = kVar.f15548a;
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextFieldValue f11336h = new TextFieldValue(4, androidx.compose.ui.text.E.f15314b, "");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.compose.ui.text.input.l f11337i = androidx.compose.ui.text.input.l.f15549g;
    public final ArrayList j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f11338k = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<BaseInputConnection>() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$baseInputConnection$2
        {
            super(0);
        }

        @Override // Ia.a
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(this.this$0.f11329a, false);
        }
    });

    /* JADX INFO: compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
    public static final class a {
        public a() {
        }
    }

    public Y(View view, Ia.l lVar, InputMethodManagerImpl inputMethodManagerImpl) {
        this.f11329a = view;
        this.f11330b = inputMethodManagerImpl;
        this.f11340m = new W(lVar, inputMethodManagerImpl);
    }

    @Override // androidx.compose.ui.platform.InterfaceC1254x0
    public final RecordingInputConnection a(EditorInfo editorInfo) {
        int i10;
        int i11;
        TextFieldValue textFieldValue = this.f11336h;
        String str = textFieldValue.f15491a.f15408c;
        androidx.compose.ui.text.input.l lVar = this.f11337i;
        int i12 = lVar.f15554e;
        boolean zA = androidx.compose.ui.text.input.k.a(i12, 1);
        boolean z10 = lVar.f15550a;
        if (zA) {
            i10 = z10 ? 6 : 0;
        } else if (androidx.compose.ui.text.input.k.a(i12, 0)) {
            i10 = 1;
        } else if (androidx.compose.ui.text.input.k.a(i12, 2)) {
            i10 = 2;
        } else if (androidx.compose.ui.text.input.k.a(i12, 6)) {
            i10 = 5;
        } else if (androidx.compose.ui.text.input.k.a(i12, 5)) {
            i10 = 7;
        } else if (androidx.compose.ui.text.input.k.a(i12, 3)) {
            i10 = 3;
        } else if (androidx.compose.ui.text.input.k.a(i12, 4)) {
            i10 = 4;
        } else {
            if (!androidx.compose.ui.text.input.k.a(i12, 7)) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i10;
        Z.c cVar = Z.c.f7671d;
        Z.c cVar2 = lVar.f15555f;
        if (kotlin.jvm.internal.i.a(cVar2, cVar)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(kotlin.collections.m.y(cVar2, 10));
            Iterator<Z.b> it = cVar2.f7672b.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f7670a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        int i13 = lVar.f15553d;
        if (androidx.compose.ui.text.input.n.a(i13, 1)) {
            i11 = 1;
        } else if (androidx.compose.ui.text.input.n.a(i13, 2)) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i11 = 1;
        } else if (androidx.compose.ui.text.input.n.a(i13, 3)) {
            i11 = 2;
        } else if (androidx.compose.ui.text.input.n.a(i13, 4)) {
            i11 = 3;
        } else if (androidx.compose.ui.text.input.n.a(i13, 5)) {
            i11 = 17;
        } else if (androidx.compose.ui.text.input.n.a(i13, 6)) {
            i11 = 33;
        } else if (androidx.compose.ui.text.input.n.a(i13, 7)) {
            i11 = 129;
        } else if (androidx.compose.ui.text.input.n.a(i13, 8)) {
            i11 = 18;
        } else {
            if (!androidx.compose.ui.text.input.n.a(i13, 9)) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i11 = 8194;
        }
        editorInfo.inputType = i11;
        if (!z10 && (i11 & 1) == 1) {
            editorInfo.inputType = i11 | 131072;
            if (androidx.compose.ui.text.input.k.a(lVar.f15554e, 1)) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if ((editorInfo.inputType & 1) == 1) {
            int i14 = lVar.f15551b;
            if (androidx.compose.ui.text.input.m.a(i14, 1)) {
                editorInfo.inputType |= 4096;
            } else if (androidx.compose.ui.text.input.m.a(i14, 2)) {
                editorInfo.inputType |= 8192;
            } else if (androidx.compose.ui.text.input.m.a(i14, 3)) {
                editorInfo.inputType |= 16384;
            }
            if (lVar.f15552c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i15 = androidx.compose.ui.text.E.f15315c;
        long j = textFieldValue.f15492b;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        F0.a.a(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!androidx.compose.foundation.text.handwriting.b.f11261a || androidx.compose.ui.text.input.n.a(i13, 7) || androidx.compose.ui.text.input.n.a(i13, 8)) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        } else {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
            editorInfo.setSupportedHandwritingGestures(kotlin.collections.l.s(C1009i.a(), C1013m.a(), C1010j.b(), C1011k.b(), C1014n.a(), C1015o.a(), C1016p.a()));
            editorInfo.setSupportedHandwritingGesturePreviews(kotlin.collections.B.C(C1009i.a(), C1013m.a(), C1010j.b(), C1011k.b()));
        }
        Ia.l<? super View, ? extends S> lVar2 = LegacyPlatformTextInputServiceAdapter_androidKt.f11292a;
        if (androidx.emoji2.text.c.d()) {
            androidx.emoji2.text.c.a().i(editorInfo);
        }
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.f11336h, new a(), this.f11337i.f15552c, this.f11333e, this.f11334f, this.f11335g);
        this.j.add(new WeakReference(recordingInputConnection));
        return recordingInputConnection;
    }
}
