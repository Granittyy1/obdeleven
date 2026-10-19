package androidx.compose.foundation.text.selection;

import android.os.Build;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0908h;
import androidx.compose.animation.core.C0910j;
import androidx.compose.foundation.A;
import androidx.compose.foundation.I;
import androidx.compose.foundation.J;
import androidx.compose.foundation.MagnifierElement;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.B;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.C1268i;
import androidx.compose.ui.text.E;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: TextFieldSelectionManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static final Ia.l a(final androidx.compose.foundation.contextmenu.g gVar, final TextFieldSelectionManager textFieldSelectionManager, final X x10) {
        return new Ia.l<ContextMenuScope, p293xa.r>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1] */
            /* JADX WARN: Type inference failed for: r3v11, types: [androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1] */
            /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1] */
            /* JADX WARN: Type inference failed for: r3v14, types: [androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1] */
            /* JADX WARN: Type inference failed for: r3v16, types: [androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1] */
            @Override // Ia.l
            public final p293xa.r invoke(ContextMenuScope contextMenuScope) {
                ContextMenuScope contextMenuScope2 = contextMenuScope;
                int i10 = x10.getValue().f11517a;
                final androidx.compose.foundation.contextmenu.g gVar2 = gVar;
                final TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
                boolean z10 = (i10 & 4) == 4;
                final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                if (z10) {
                    ContextMenuScope.b(contextMenuScope2, new Ia.p<InterfaceC1084f, Integer, String>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final String invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                            num.intValue();
                            interfaceC1084f2.L(-1744780674);
                            String strA = textContextMenuItems.a(interfaceC1084f2);
                            interfaceC1084f2.D();
                            return strA;
                        }
                    }, new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            textFieldSelectionManager2.e();
                            androidx.compose.foundation.contextmenu.h.a(gVar2);
                            return p293xa.r.f47939a;
                        }
                    });
                }
                final androidx.compose.foundation.contextmenu.g gVar3 = gVar;
                final TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
                boolean z11 = (i10 & 1) == 1;
                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                if (z11) {
                    ContextMenuScope.b(contextMenuScope2, new Ia.p<InterfaceC1084f, Integer, String>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final String invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                            num.intValue();
                            interfaceC1084f2.L(-1744780674);
                            String strA = textContextMenuItems2.a(interfaceC1084f2);
                            interfaceC1084f2.D();
                            return strA;
                        }
                    }, new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            textFieldSelectionManager3.c(false);
                            androidx.compose.foundation.contextmenu.h.a(gVar3);
                            return p293xa.r.f47939a;
                        }
                    });
                }
                final androidx.compose.foundation.contextmenu.g gVar4 = gVar;
                final TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
                boolean z12 = (i10 & 2) == 2;
                final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                if (z12) {
                    ContextMenuScope.b(contextMenuScope2, new Ia.p<InterfaceC1084f, Integer, String>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final String invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                            num.intValue();
                            interfaceC1084f2.L(-1744780674);
                            String strA = textContextMenuItems3.a(interfaceC1084f2);
                            interfaceC1084f2.D();
                            return strA;
                        }
                    }, new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            textFieldSelectionManager4.n();
                            androidx.compose.foundation.contextmenu.h.a(gVar4);
                            return p293xa.r.f47939a;
                        }
                    });
                }
                final androidx.compose.foundation.contextmenu.g gVar5 = gVar;
                final TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
                boolean z13 = (i10 & 8) == 8;
                final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager;
                if (z13) {
                    ContextMenuScope.b(contextMenuScope2, new Ia.p<InterfaceC1084f, Integer, String>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final String invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                            num.intValue();
                            interfaceC1084f2.L(-1744780674);
                            String strA = textContextMenuItems4.a(interfaceC1084f2);
                            interfaceC1084f2.D();
                            return strA;
                        }
                    }, new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            textFieldSelectionManager5.o();
                            androidx.compose.foundation.contextmenu.h.a(gVar5);
                            return p293xa.r.f47939a;
                        }
                    });
                }
                final androidx.compose.foundation.contextmenu.g gVar6 = gVar;
                final TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.Autofill;
                boolean z14 = textFieldSelectionManager.i() && E.b(textFieldSelectionManager.l().f15492b);
                final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                if (z14) {
                    ContextMenuScope.b(contextMenuScope2, new Ia.p<InterfaceC1084f, Integer, String>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final String invoke(InterfaceC1084f interfaceC1084f, Integer num) {
                            InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                            num.intValue();
                            interfaceC1084f2.L(-1744780674);
                            String strA = textContextMenuItems5.a(interfaceC1084f2);
                            interfaceC1084f2.D();
                            return strA;
                        }
                    }, new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [Ia.a, kotlin.jvm.internal.Lambda] */
                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            ?? r10 = textFieldSelectionManager6.f11558g;
                            if (r10 != 0) {
                                r10.invoke();
                            }
                            androidx.compose.foundation.contextmenu.h.a(gVar6);
                            return p293xa.r.f47939a;
                        }
                    });
                }
                return p293xa.r.f47939a;
            }
        };
    }

    public static final androidx.compose.ui.h b(final TextFieldSelectionManager textFieldSelectionManager) {
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        if (!A.a()) {
            return aVar;
        }
        return ComposedModifierKt.a(aVar, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1
            {
                super(3);
            }

            @Override // Ia.q
            public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, Integer num) {
                androidx.compose.ui.h hVar2 = hVar;
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                num.intValue();
                interfaceC1084f2.L(1980580247);
                final p013b0.c cVar = (p013b0.c) interfaceC1084f2.x(CompositionLocalsKt.f14847h);
                Object objF = interfaceC1084f2.f();
                InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = J0.f(new p013b0.l(0L));
                    interfaceC1084f2.E(objF);
                }
                final X x10 = (X) objF;
                boolean zK = interfaceC1084f2.k(textFieldSelectionManager);
                final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                Object objF2 = interfaceC1084f2.f();
                if (zK || objF2 == c0153a) {
                    objF2 = new Ia.a<I.d>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.a
                        public final I.d invoke() {
                            long j;
                            androidx.compose.foundation.text.A aD;
                            LegacyTextFieldState legacyTextFieldState;
                            C1260a c1260a;
                            TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager2;
                            long j10 = x10.getValue().f20490a;
                            I.d dVarH = textFieldSelectionManager3.h();
                            long jFloatToRawIntBits = 9205357640488583168L;
                            if (dVarH != null) {
                                LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager3.f11555d;
                                C1260a c1260a2 = legacyTextFieldState2 != null ? legacyTextFieldState2.f11177a.f11520a : null;
                                if (c1260a2 != null && c1260a2.f15408c.length() != 0) {
                                    Handle handle = (Handle) textFieldSelectionManager3.f11568r.getValue();
                                    int i10 = handle == null ? -1 : TextFieldSelectionManagerKt.c.f11581a[handle.ordinal()];
                                    if (i10 != -1) {
                                        if (i10 == 1 || i10 == 2) {
                                            long j11 = textFieldSelectionManager3.l().f15492b;
                                            int i11 = E.f15315c;
                                            j = j11 >> 32;
                                        } else {
                                            if (i10 != 3) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            long j12 = textFieldSelectionManager3.l().f15492b;
                                            int i12 = E.f15315c;
                                            j = j12 & 4294967295L;
                                        }
                                        int i13 = (int) j;
                                        LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager3.f11555d;
                                        if (legacyTextFieldState3 != null && (aD = legacyTextFieldState3.d()) != null && (legacyTextFieldState = textFieldSelectionManager3.f11555d) != null && (c1260a = legacyTextFieldState.f11177a.f11520a) != null) {
                                            int iD = Na.l.D(textFieldSelectionManager3.f11553b.b(i13), 0, c1260a.f15408c.length());
                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (aD.d(dVarH.f3754a) >> 32));
                                            B b10 = aD.f11055a;
                                            int iD2 = b10.f15301b.d(iD);
                                            float fE = b10.e(iD2);
                                            float f10 = b10.f(iD2);
                                            float fC = Na.l.C(fIntBitsToFloat, Math.min(fE, f10), Math.max(fE, f10));
                                            if (p013b0.l.b(j10, 0L) || Math.abs(fIntBitsToFloat - fC) <= ((int) (j10 >> 32)) / 2) {
                                                C1268i c1268i = b10.f15301b;
                                                float f11 = c1268i.f(iD2);
                                                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(((c1268i.b(iD2) - f11) / 2) + f11)) & 4294967295L);
                                            }
                                        }
                                    }
                                }
                            }
                            return new I.d(jFloatToRawIntBits);
                        }
                    };
                    interfaceC1084f2.E(objF2);
                }
                final Ia.a aVar2 = (Ia.a) objF2;
                boolean zK2 = interfaceC1084f2.K(cVar);
                Object objF3 = interfaceC1084f2.f();
                if (zK2 || objF3 == c0153a) {
                    objF3 = new Ia.l<Ia.a<? extends I.d>, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final androidx.compose.ui.h invoke(Ia.a<? extends I.d> aVar3) {
                            final Ia.a<? extends I.d> aVar4 = aVar3;
                            androidx.compose.ui.h.a aVar5 = androidx.compose.ui.h.a.f13984b;
                            Ia.l<p013b0.c, I.d> lVar = new Ia.l<p013b0.c, I.d>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final I.d invoke(p013b0.c cVar2) {
                                    return new I.d(aVar4.invoke().f3754a);
                                }
                            };
                            final p013b0.c cVar2 = cVar;
                            final X<p013b0.l> x11 = x10;
                            Ia.l<p013b0.h, p293xa.r> lVar2 = new Ia.l<p013b0.h, p293xa.r>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(p013b0.h hVar3) {
                                    long j = hVar3.f20483a;
                                    X<p013b0.l> x12 = x11;
                                    p013b0.c cVar3 = cVar2;
                                    x12.setValue(new p013b0.l((((long) cVar3.e1(p013b0.h.b(j))) << 32) | (((long) cVar3.e1(p013b0.h.a(j))) & 4294967295L)));
                                    return p293xa.r.f47939a;
                                }
                            };
                            if (A.a()) {
                                return A.a() ? new MagnifierElement(lVar, null, lVar2, Float.NaN, true, 9205357640488583168L, Float.NaN, Float.NaN, true, Build.VERSION.SDK_INT == 28 ? I.f9770a : J.f9778a) : aVar5;
                            }
                            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
                        }
                    };
                    interfaceC1084f2.E(objF3);
                }
                final Ia.l lVar = (Ia.l) objF3;
                C0910j c0910j = SelectionMagnifierKt.f11541a;
                androidx.compose.ui.h hVarA = ComposedModifierKt.a(hVar2, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // Ia.q
                    public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar3, InterfaceC1084f interfaceC1084f3, Integer num2) {
                        InterfaceC1084f interfaceC1084f4 = interfaceC1084f3;
                        num2.intValue();
                        interfaceC1084f4.L(759876635);
                        Ia.a<I.d> aVar3 = aVar2;
                        C0910j c0910j2 = SelectionMagnifierKt.f11541a;
                        Object objF4 = interfaceC1084f4.f();
                        Object obj = InterfaceC1084f.a.f12980a;
                        if (objF4 == obj) {
                            objF4 = J0.d(aVar3);
                            interfaceC1084f4.E(objF4);
                        }
                        N0 n10 = (N0) objF4;
                        Object objF5 = interfaceC1084f4.f();
                        if (objF5 == obj) {
                            objF5 = new Animatable(new I.d(((I.d) n10.getValue()).f3754a), SelectionMagnifierKt.f11542b, new I.d(SelectionMagnifierKt.f11543c), 8);
                            interfaceC1084f4.E(objF5);
                        }
                        Animatable animatable = (Animatable) objF5;
                        p293xa.r rVar = p293xa.r.f47939a;
                        boolean zK3 = interfaceC1084f4.k(animatable);
                        Object objF6 = interfaceC1084f4.f();
                        if (zK3 || objF6 == obj) {
                            objF6 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(n10, animatable, null);
                            interfaceC1084f4.E(objF6);
                        }
                        androidx.compose.runtime.E.d((Ia.p) objF6, interfaceC1084f4, rVar);
                        final C0908h<T, V> c0908h = animatable.f9338c;
                        Ia.l<Ia.a<I.d>, androidx.compose.ui.h> lVar2 = lVar;
                        boolean zK4 = interfaceC1084f4.K(c0908h);
                        Object objF7 = interfaceC1084f4.f();
                        if (zK4 || objF7 == obj) {
                            objF7 = new Ia.a<I.d>() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final I.d invoke() {
                                    return new I.d(c0908h.getValue().f3754a);
                                }
                            };
                            interfaceC1084f4.E(objF7);
                        }
                        androidx.compose.ui.h hVarInvoke = lVar2.invoke((Ia.a) objF7);
                        interfaceC1084f4.D();
                        return hVarInvoke;
                    }
                });
                interfaceC1084f2.D();
                return hVarA;
            }
        });
    }
}
