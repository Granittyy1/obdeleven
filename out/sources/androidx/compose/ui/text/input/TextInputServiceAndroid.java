package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@p293xa.d
public final class TextInputServiceAndroid implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f15496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputMethodManagerImpl f15497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f15498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Lambda f15500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Lambda f15501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextFieldValue f15502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f15503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f15504i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f15505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1271c f15506l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<TextInputCommand> f15507m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public z f15508n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: TextInputServiceAndroid.android.kt */
    public static final class TextInputCommand {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TextInputCommand f15509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final TextInputCommand f15510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final TextInputCommand f15511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final TextInputCommand f15512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ TextInputCommand[] f15513f;

        static {
            TextInputCommand textInputCommand = new TextInputCommand("StartInput", 0);
            f15509b = textInputCommand;
            TextInputCommand textInputCommand2 = new TextInputCommand("StopInput", 1);
            f15510c = textInputCommand2;
            TextInputCommand textInputCommand3 = new TextInputCommand("ShowKeyboard", 2);
            f15511d = textInputCommand3;
            TextInputCommand textInputCommand4 = new TextInputCommand("HideKeyboard", 3);
            f15512e = textInputCommand4;
            TextInputCommand[] textInputCommandArr = {textInputCommand, textInputCommand2, textInputCommand3, textInputCommand4};
            f15513f = textInputCommandArr;
            kotlin.enums.a.a(textInputCommandArr);
        }

        public TextInputCommand() {
            throw null;
        }

        public static TextInputCommand valueOf(String str) {
            return (TextInputCommand) Enum.valueOf(TextInputCommand.class, str);
        }

        public static TextInputCommand[] values() {
            return (TextInputCommand[]) f15513f.clone();
        }
    }

    public TextInputServiceAndroid(View view, AndroidComposeView androidComposeView) {
        InputMethodManagerImpl inputMethodManagerImpl = new InputMethodManagerImpl(view);
        final Choreographer choreographer = Choreographer.getInstance();
        Executor executor = new Executor() { // from class: androidx.compose.ui.text.input.A
            @Override // java.util.concurrent.Executor
            public final void execute(final Runnable runnable) {
                choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.B
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        runnable.run();
                    }
                });
            }
        };
        this.f15496a = view;
        this.f15497b = inputMethodManagerImpl;
        this.f15498c = executor;
        this.f15500e = new Ia.l<List<? extends g>, p293xa.r>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ p293xa.r invoke(List<? extends g> list) {
                return p293xa.r.f47939a;
            }
        };
        this.f15501f = new Ia.l<k, p293xa.r>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            @Override // Ia.l
            public final /* synthetic */ p293xa.r invoke(k kVar) {
                int i10 = kVar.f15548a;
                return p293xa.r.f47939a;
            }
        };
        this.f15502g = new TextFieldValue(4, androidx.compose.ui.text.E.f15314b, "");
        this.f15503h = l.f15549g;
        this.f15504i = new ArrayList();
        this.j = kotlin.a.b(LazyThreadSafetyMode.f42973d, new Ia.a<BaseInputConnection>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            @Override // Ia.a
            public final BaseInputConnection invoke() {
                return new BaseInputConnection(this.this$0.f15496a, false);
            }
        });
        this.f15506l = new C1271c(androidComposeView, inputMethodManagerImpl);
        this.f15507m = new androidx.compose.runtime.collection.c<>(new TextInputCommand[16]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.text.input.t
    public final void a(TextFieldValue textFieldValue, l lVar, Ia.l<? super List<? extends g>, p293xa.r> lVar2, Ia.l<? super k, p293xa.r> lVar3) {
        this.f15499d = true;
        this.f15502g = textFieldValue;
        this.f15503h = lVar;
        this.f15500e = (Lambda) lVar2;
        this.f15501f = (Lambda) lVar3;
        i(TextInputCommand.f15509b);
    }

    @Override // androidx.compose.ui.text.input.t
    public final void b() {
        i(TextInputCommand.f15509b);
    }

    @Override // androidx.compose.ui.text.input.t
    public final void c() {
        i(TextInputCommand.f15511d);
    }

    @Override // androidx.compose.ui.text.input.t
    public final void d() {
        this.f15499d = false;
        this.f15500e = new Ia.l<List<? extends g>, p293xa.r>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$1
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ p293xa.r invoke(List<? extends g> list) {
                return p293xa.r.f47939a;
            }
        };
        this.f15501f = new Ia.l<k, p293xa.r>() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$2
            @Override // Ia.l
            public final /* synthetic */ p293xa.r invoke(k kVar) {
                int i10 = kVar.f15548a;
                return p293xa.r.f47939a;
            }
        };
        this.f15505k = null;
        i(TextInputCommand.f15510c);
    }

    @Override // androidx.compose.ui.text.input.t
    @p293xa.d
    public final void e(I.f fVar) {
        Rect rect;
        this.f15505k = new Rect(Ka.a.b(fVar.f3757a), Ka.a.b(fVar.f3758b), Ka.a.b(fVar.f3759c), Ka.a.b(fVar.f3760d));
        if (!this.f15504i.isEmpty() || (rect = this.f15505k) == null) {
            return;
        }
        this.f15496a.requestRectangleOnScreen(new Rect(rect));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.text.input.t
    public final void f(TextFieldValue textFieldValue, r rVar, androidx.compose.ui.text.B b10, Ia.l<? super a0, p293xa.r> lVar, I.f fVar, I.f fVar2) {
        C1271c c1271c = this.f15506l;
        synchronized (c1271c.f15522c) {
            try {
                c1271c.j = textFieldValue;
                c1271c.f15530l = rVar;
                c1271c.f15529k = b10;
                c1271c.f15531m = (Lambda) lVar;
                c1271c.f15532n = fVar;
                c1271c.f15533o = fVar2;
                if (c1271c.f15524e || c1271c.f15523d) {
                    c1271c.a();
                }
                p293xa.r rVar2 = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.ui.text.input.t
    public final void g() {
        i(TextInputCommand.f15512e);
    }

    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, xa.g] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, xa.g] */
    @Override // androidx.compose.ui.text.input.t
    public final void h(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z10 = (androidx.compose.ui.text.E.a(this.f15502g.f15492b, textFieldValue2.f15492b) && kotlin.jvm.internal.i.a(this.f15502g.f15493c, textFieldValue2.f15493c)) ? false : true;
        this.f15502g = textFieldValue2;
        int size = this.f15504i.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = (u) ((WeakReference) this.f15504i.get(i10)).get();
            if (uVar != null) {
                uVar.f15568d = textFieldValue2;
            }
        }
        C1271c c1271c = this.f15506l;
        synchronized (c1271c.f15522c) {
            c1271c.j = null;
            c1271c.f15530l = null;
            c1271c.f15529k = null;
            c1271c.f15531m = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$invalidate$1$1
                @Override // Ia.l
                public final /* synthetic */ p293xa.r invoke(a0 a0Var) {
                    float[] fArr = a0Var.f13538a;
                    return p293xa.r.f47939a;
                }
            };
            c1271c.f15532n = null;
            c1271c.f15533o = null;
            p293xa.r rVar = p293xa.r.f47939a;
        }
        if (kotlin.jvm.internal.i.a(textFieldValue, textFieldValue2)) {
            if (z10) {
                InputMethodManagerImpl inputMethodManagerImpl = this.f15497b;
                int iE = androidx.compose.ui.text.E.e(textFieldValue2.f15492b);
                int iD = androidx.compose.ui.text.E.d(textFieldValue2.f15492b);
                androidx.compose.ui.text.E e10 = this.f15502g.f15493c;
                int iE2 = e10 != null ? androidx.compose.ui.text.E.e(e10.f15316a) : -1;
                androidx.compose.ui.text.E e11 = this.f15502g.f15493c;
                inputMethodManagerImpl.a(iE, iD, iE2, e11 != null ? androidx.compose.ui.text.E.d(e11.f15316a) : -1);
                return;
            }
            return;
        }
        if (textFieldValue != null && (!kotlin.jvm.internal.i.a(textFieldValue.f15491a.f15408c, textFieldValue2.f15491a.f15408c) || (androidx.compose.ui.text.E.a(textFieldValue.f15492b, textFieldValue2.f15492b) && !kotlin.jvm.internal.i.a(textFieldValue.f15493c, textFieldValue2.f15493c)))) {
            InputMethodManagerImpl inputMethodManagerImpl2 = this.f15497b;
            ((InputMethodManager) inputMethodManagerImpl2.f15488b.getValue()).restartInput(inputMethodManagerImpl2.f15487a);
            return;
        }
        int size2 = this.f15504i.size();
        for (int i11 = 0; i11 < size2; i11++) {
            u uVar2 = (u) ((WeakReference) this.f15504i.get(i11)).get();
            if (uVar2 != null) {
                TextFieldValue textFieldValue3 = this.f15502g;
                InputMethodManagerImpl inputMethodManagerImpl3 = this.f15497b;
                if (uVar2.f15572h) {
                    uVar2.f15568d = textFieldValue3;
                    if (uVar2.f15570f) {
                        ((InputMethodManager) inputMethodManagerImpl3.f15488b.getValue()).updateExtractedText(inputMethodManagerImpl3.f15487a, uVar2.f15569e, com.voltasit.obdeleven.domain.usecases.device.v.h(textFieldValue3));
                    }
                    androidx.compose.ui.text.E e12 = textFieldValue3.f15493c;
                    int iE3 = e12 != null ? androidx.compose.ui.text.E.e(e12.f15316a) : -1;
                    androidx.compose.ui.text.E e13 = textFieldValue3.f15493c;
                    int iD2 = e13 != null ? androidx.compose.ui.text.E.d(e13.f15316a) : -1;
                    long j = textFieldValue3.f15492b;
                    inputMethodManagerImpl3.a(androidx.compose.ui.text.E.e(j), androidx.compose.ui.text.E.d(j), iE3, iD2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.text.input.z, java.lang.Runnable] */
    public final void i(TextInputCommand textInputCommand) {
        this.f15507m.b(textInputCommand);
        if (this.f15508n == null) {
            ?? r10 = new Runnable() { // from class: androidx.compose.ui.text.input.z
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, xa.g] */
                /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, xa.g] */
                /* JADX WARN: Type inference failed for: r9v2, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r9v6, types: [T, java.lang.Boolean] */
                @Override // java.lang.Runnable
                public final void run() {
                    View viewFindFocus;
                    TextInputServiceAndroid textInputServiceAndroid = this.f15581b;
                    textInputServiceAndroid.f15508n = null;
                    View view = textInputServiceAndroid.f15496a;
                    boolean zIsFocused = view.isFocused();
                    androidx.compose.runtime.collection.c<TextInputServiceAndroid.TextInputCommand> cVar = textInputServiceAndroid.f15507m;
                    if (!zIsFocused && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                        cVar.j();
                        return;
                    }
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    TextInputServiceAndroid.TextInputCommand[] textInputCommandArr = cVar.f12943b;
                    int i10 = cVar.f12945d;
                    for (int i11 = 0; i11 < i10; i11++) {
                        TextInputServiceAndroid.TextInputCommand textInputCommand2 = textInputCommandArr[i11];
                        int iOrdinal = textInputCommand2.ordinal();
                        if (iOrdinal == 0) {
                            ?? r11 = Boolean.TRUE;
                            ref$ObjectRef.element = r11;
                            ref$ObjectRef2.element = r11;
                        } else if (iOrdinal == 1) {
                            ?? r12 = Boolean.FALSE;
                            ref$ObjectRef.element = r12;
                            ref$ObjectRef2.element = r12;
                        } else if ((iOrdinal == 2 || iOrdinal == 3) && !kotlin.jvm.internal.i.a(ref$ObjectRef.element, Boolean.FALSE)) {
                            ref$ObjectRef2.element = Boolean.valueOf(textInputCommand2 == TextInputServiceAndroid.TextInputCommand.f15511d);
                        }
                    }
                    cVar.j();
                    boolean zA = kotlin.jvm.internal.i.a(ref$ObjectRef.element, Boolean.TRUE);
                    InputMethodManagerImpl inputMethodManagerImpl = textInputServiceAndroid.f15497b;
                    if (zA) {
                        ((InputMethodManager) inputMethodManagerImpl.f15488b.getValue()).restartInput(inputMethodManagerImpl.f15487a);
                    }
                    Boolean bool = (Boolean) ref$ObjectRef2.element;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            inputMethodManagerImpl.f15489c.f16846a.b();
                        } else {
                            inputMethodManagerImpl.f15489c.f16846a.a();
                        }
                    }
                    if (kotlin.jvm.internal.i.a(ref$ObjectRef.element, Boolean.FALSE)) {
                        ((InputMethodManager) inputMethodManagerImpl.f15488b.getValue()).restartInput(inputMethodManagerImpl.f15487a);
                    }
                }
            };
            this.f15498c.execute(r10);
            this.f15508n = r10;
        }
    }
}
