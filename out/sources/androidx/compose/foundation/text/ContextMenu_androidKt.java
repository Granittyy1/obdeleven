package androidx.compose.foundation.text;

import androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.X;
import androidx.compose.ui.platform.Y;
import androidx.compose.ui.platform.Z;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.CoroutineStart;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ContextMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ContextMenu_androidKt {
    public static final void a(final TextFieldSelectionManager textFieldSelectionManager, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-1985516685);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(textFieldSelectionManager) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(pVar) ? 32 : 16;
        }
        if (c1086gP.C(i11 & 1, (i11 & 19) != 18)) {
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = new androidx.compose.foundation.contextmenu.g(0);
                c1086gP.E(objF);
            }
            final androidx.compose.foundation.contextmenu.g gVar = (androidx.compose.foundation.contextmenu.g) objF;
            Object objF2 = c1086gP.f();
            if (objF2 == c0153a) {
                objF2 = androidx.compose.runtime.E.f(EmptyCoroutineContext.f43032b, c1086gP);
                c1086gP.E(objF2);
            }
            final kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) objF2;
            Object objF3 = c1086gP.f();
            if (objF3 == c0153a) {
                objF3 = J0.f(new o(0));
                c1086gP.E(objF3);
            }
            final X x10 = (X) objF3;
            Object objF4 = c1086gP.f();
            if (objF4 == c0153a) {
                objF4 = new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$1$1
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        androidx.compose.foundation.contextmenu.h.a(gVar);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF4);
            }
            Ia.a aVar = (Ia.a) objF4;
            Ia.l lVarA = androidx.compose.foundation.text.selection.w.a(gVar, textFieldSelectionManager, x10);
            boolean zJ = textFieldSelectionManager.j();
            boolean zK = c1086gP.k(a10) | c1086gP.k(textFieldSelectionManager);
            Object objF5 = c1086gP.f();
            if (zK || objF5 == c0153a) {
                objF5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1

                    /* JADX INFO: renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: ContextMenu.android.kt */
                    @Aa.c(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1", f = "ContextMenu.android.kt", l = {R.styleable.AppCompatTheme_colorError}, m = "invokeSuspend")
                    final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                        final /* synthetic */ TextFieldSelectionManager $manager;
                        final /* synthetic */ X<o> $menuItemsAvailability;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(X<o> x10, TextFieldSelectionManager textFieldSelectionManager, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$menuItemsAvailability = x10;
                            this.$manager = textFieldSelectionManager;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                            return new AnonymousClass1(this.$menuItemsAvailability, this.$manager, cVar);
                        }

                        @Override // Ia.p
                        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            X x10;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            int i10 = this.label;
                            if (i10 == 0) {
                                kotlin.b.b(obj);
                                X<o> x11 = this.$menuItemsAvailability;
                                TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                                this.L$0 = x11;
                                this.label = 1;
                                Object objB = ContextMenu_androidKt.b(textFieldSelectionManager, this);
                                if (objB == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                x10 = x11;
                                obj = objB;
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                x10 = (X) this.L$0;
                                kotlin.b.b(obj);
                            }
                            x10.setValue(obj);
                            return p293xa.r.f47939a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        C2680e.c(a10, null, CoroutineStart.f43169e, new AnonymousClass1(x10, textFieldSelectionManager, null), 1);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF5);
            }
            ContextMenuArea_androidKt.b(gVar, aVar, lVarA, null, zJ, (Ia.a) objF5, pVar, c1086gP, ((i11 << 15) & 3670016) | 54, 8);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ContextMenu_androidKt.a(textFieldSelectionManager, pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00da  */
    /* JADX WARN: Code duplicated, block: B:61:0x00de  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(TextFieldSelectionManager textFieldSelectionManager, ContinuationImpl continuationImpl) {
        ContextMenu_androidKt$getContextMenuItemsAvailability$2 contextMenu_androidKt$getContextMenuItemsAvailability$2;
        int i10;
        int i11;
        int i12;
        TextFieldSelectionManager textFieldSelectionManager2;
        int i13;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i14;
        int i15;
        int i16;
        if (continuationImpl instanceof ContextMenu_androidKt$getContextMenuItemsAvailability$2) {
            contextMenu_androidKt$getContextMenuItemsAvailability$2 = (ContextMenu_androidKt$getContextMenuItemsAvailability$2) continuationImpl;
            int i17 = contextMenu_androidKt$getContextMenuItemsAvailability$2.label;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                contextMenu_androidKt$getContextMenuItemsAvailability$2.label = i17 - Integer.MIN_VALUE;
            } else {
                contextMenu_androidKt$getContextMenuItemsAvailability$2 = new ContextMenu_androidKt$getContextMenuItemsAvailability$2(continuationImpl);
            }
        } else {
            contextMenu_androidKt$getContextMenuItemsAvailability$2 = new ContextMenu_androidKt$getContextMenuItemsAvailability$2(continuationImpl);
        }
        Object obj = contextMenu_androidKt$getContextMenuItemsAvailability$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i18 = contextMenu_androidKt$getContextMenuItemsAvailability$2.label;
        if (i18 == 0) {
            kotlin.b.b(obj);
            androidx.compose.ui.text.input.E e10 = textFieldSelectionManager.f11557f;
            i10 = !androidx.compose.ui.text.E.b(textFieldSelectionManager.l().f15492b) ? 1 : 0;
            if (textFieldSelectionManager.i()) {
                Z z14 = textFieldSelectionManager.f11559h;
                if (z14 != null) {
                    contextMenu_androidKt$getContextMenuItemsAvailability$2.L$0 = textFieldSelectionManager;
                    contextMenu_androidKt$getContextMenuItemsAvailability$2.I$0 = 0;
                    contextMenu_androidKt$getContextMenuItemsAvailability$2.I$1 = i10;
                    contextMenu_androidKt$getContextMenuItemsAvailability$2.I$2 = i10;
                    contextMenu_androidKt$getContextMenuItemsAvailability$2.label = 1;
                    Y yB = z14.b();
                    if (yB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i10 = i10;
                    i12 = 0;
                    obj = yB;
                    textFieldSelectionManager2 = textFieldSelectionManager;
                    i13 = i10;
                } else {
                    i11 = i10;
                    i12 = 0;
                }
                z10 = false;
                if (z10) {
                    z11 = true;
                }
                if (i10 == 0 && textFieldSelectionManager.i() && i12 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (androidx.compose.ui.text.E.c(textFieldSelectionManager.l().f15492b) != textFieldSelectionManager.l().f15491a.f15408c.length()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z15 = !textFieldSelectionManager.i() && androidx.compose.ui.text.E.b(textFieldSelectionManager.l().f15492b);
                if (z11) {
                    i14 = 2;
                } else {
                    i14 = 0;
                }
                int i19 = i14 | i11;
                if (z12) {
                    i15 = 4;
                } else {
                    i15 = 0;
                }
                int i20 = i19 | i15;
                if (z13) {
                    i16 = 8;
                } else {
                    i16 = 0;
                }
                return new o(i20 | i16 | (z15 ? 16 : 0));
            }
            i11 = i10;
            i12 = 0;
            z11 = false;
            if (i10 == 0) {
                z12 = false;
            } else {
                z12 = false;
            }
            if (androidx.compose.ui.text.E.c(textFieldSelectionManager.l().f15492b) != textFieldSelectionManager.l().f15491a.f15408c.length()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (textFieldSelectionManager.i()) {
            }
            if (z11) {
                i14 = 2;
            } else {
                i14 = 0;
            }
            int i110 = i14 | i11;
            if (z12) {
                i15 = 4;
            } else {
                i15 = 0;
            }
            int i21 = i110 | i15;
            if (z13) {
                i16 = 8;
            } else {
                i16 = 0;
            }
            return new o(i21 | i16 | (z15 ? 16 : 0));
        }
        if (i18 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i13 = contextMenu_androidKt$getContextMenuItemsAvailability$2.I$2;
        i10 = contextMenu_androidKt$getContextMenuItemsAvailability$2.I$1;
        i12 = contextMenu_androidKt$getContextMenuItemsAvailability$2.I$0;
        textFieldSelectionManager2 = (TextFieldSelectionManager) contextMenu_androidKt$getContextMenuItemsAvailability$2.L$0;
        kotlin.b.b(obj);
        Y y10 = (Y) obj;
        if (y10 != null) {
            TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
            i11 = i13;
            textFieldSelectionManager = textFieldSelectionManager3;
            z10 = y10.f15013a.getDescription().hasMimeType("text/*");
        } else {
            i10 = i10;
            TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager2;
            i11 = i13;
            textFieldSelectionManager = textFieldSelectionManager4;
            z10 = false;
        }
        if (z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i10 == 0) {
            z12 = false;
        } else {
            z12 = false;
        }
        if (androidx.compose.ui.text.E.c(textFieldSelectionManager.l().f15492b) != textFieldSelectionManager.l().f15491a.f15408c.length()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (textFieldSelectionManager.i()) {
        }
        if (z11) {
            i14 = 2;
        } else {
            i14 = 0;
        }
        int i111 = i14 | i11;
        if (z12) {
            i15 = 4;
        } else {
            i15 = 0;
        }
        int i22 = i111 | i15;
        if (z13) {
            i16 = 8;
        } else {
            i16 = 0;
        }
        return new o(i22 | i16 | (z15 ? 16 : 0));
    }
}
