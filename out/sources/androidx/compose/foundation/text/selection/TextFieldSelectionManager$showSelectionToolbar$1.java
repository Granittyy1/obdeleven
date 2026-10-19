package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.platform.P0;
import androidx.compose.ui.platform.Y;
import androidx.compose.ui.platform.Z;
import androidx.compose.ui.text.B;
import androidx.compose.ui.text.input.E;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1", f = "TextFieldSelectionManager.kt", l = {781}, m = "invokeSuspend")
final class TextFieldSelectionManager$showSelectionToolbar$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$showSelectionToolbar$1(TextFieldSelectionManager textFieldSelectionManager, kotlin.coroutines.c<? super TextFieldSelectionManager$showSelectionToolbar$1> cVar) {
        super(2, cVar);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new TextFieldSelectionManager$showSelectionToolbar$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((TextFieldSelectionManager$showSelectionToolbar$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0232  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd A[PHI: r2 r6
      0x00bd: PHI (r2v16 Ia.a<xa.r>) = (r2v9 Ia.a<xa.r>), (r2v40 Ia.a<xa.r>) binds: [B:26:0x0083, B:40:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r6v13 Ia.a<xa.r>) = (r6v7 Ia.a<xa.r>), (r6v29 Ia.a<xa.r>) binds: [B:26:0x0083, B:40:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX WARN: Code duplicated, block: B:56:0x010c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0110  */
    /* JADX WARN: Code duplicated, block: B:60:0x0114  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:67:0x0151  */
    /* JADX WARN: Code duplicated, block: B:73:0x0169  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LegacyTextFieldState legacyTextFieldState;
        Ia.a<p293xa.r> aVar;
        Ia.a<p293xa.r> aVar2;
        Object objB;
        Ia.a<p293xa.r> aVar3;
        boolean z10;
        Ia.a<p293xa.r> aVar4;
        Ia.a<p293xa.r> aVar5;
        Ia.a<p293xa.r> aVar6;
        Ia.a<p293xa.r> aVar7;
        Ia.a<p293xa.r> aVar8;
        TextFieldSelectionManager textFieldSelectionManager;
        P0 p10;
        LegacyTextFieldState legacyTextFieldState2;
        I.f fVar;
        LegacyTextFieldState legacyTextFieldState3;
        LegacyTextFieldState legacyTextFieldState4;
        long jG0;
        LegacyTextFieldState legacyTextFieldState5;
        LegacyTextFieldState legacyTextFieldState6;
        float fIntBitsToFloat;
        LegacyTextFieldState legacyTextFieldState7;
        float fIntBitsToFloat2;
        InterfaceC1170p interfaceC1170pC;
        B b10;
        InterfaceC1170p interfaceC1170pC2;
        B b11;
        InterfaceC1170p interfaceC1170pC3;
        InterfaceC1170p interfaceC1170pC4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            if (!this.this$0.j() || ((legacyTextFieldState = this.this$0.f11555d) != null && !((Boolean) legacyTextFieldState.f11192q.getValue()).booleanValue())) {
                return p293xa.r.f47939a;
            }
            TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
            E e10 = textFieldSelectionManager2.f11557f;
            if (androidx.compose.ui.text.E.b(textFieldSelectionManager2.l().f15492b)) {
                aVar = null;
            } else {
                final TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                aVar = new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$copy$1

                    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$copy$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
                    @Aa.c(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$copy$1$1", f = "TextFieldSelectionManager.kt", l = {}, m = "invokeSuspend")
                    final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                        int label;
                        final /* synthetic */ TextFieldSelectionManager this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(TextFieldSelectionManager textFieldSelectionManager, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.this$0 = textFieldSelectionManager;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                            return new AnonymousClass1(this.this$0, cVar);
                        }

                        @Override // Ia.p
                        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.b.b(obj);
                            this.this$0.c(true);
                            return p293xa.r.f47939a;
                        }
                    }

                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager3;
                        A a10 = textFieldSelectionManager4.f11560i;
                        if (a10 != null) {
                            C2680e.c(a10, null, CoroutineStart.f43169e, new AnonymousClass1(textFieldSelectionManager4, null), 1);
                        }
                        textFieldSelectionManager3.m();
                        return p293xa.r.f47939a;
                    }
                };
            }
            if (androidx.compose.ui.text.E.b(this.this$0.l().f15492b) || !this.this$0.i()) {
                aVar2 = null;
            } else {
                final TextFieldSelectionManager textFieldSelectionManager4 = this.this$0;
                aVar2 = new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$cut$1

                    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$cut$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
                    @Aa.c(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$cut$1$1", f = "TextFieldSelectionManager.kt", l = {}, m = "invokeSuspend")
                    final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                        int label;
                        final /* synthetic */ TextFieldSelectionManager this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(TextFieldSelectionManager textFieldSelectionManager, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.this$0 = textFieldSelectionManager;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                            return new AnonymousClass1(this.this$0, cVar);
                        }

                        @Override // Ia.p
                        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.b.b(obj);
                            this.this$0.e();
                            return p293xa.r.f47939a;
                        }
                    }

                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager4;
                        A a10 = textFieldSelectionManager5.f11560i;
                        if (a10 != null) {
                            C2680e.c(a10, null, CoroutineStart.f43169e, new AnonymousClass1(textFieldSelectionManager5, null), 1);
                        }
                        textFieldSelectionManager4.m();
                        return p293xa.r.f47939a;
                    }
                };
            }
            if (this.this$0.i()) {
                Z z11 = this.this$0.f11559h;
                if (z11 != null) {
                    this.L$0 = aVar;
                    this.L$1 = aVar2;
                    this.label = 1;
                    objB = z11.b();
                    if (objB == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar3 = aVar2;
                } else {
                    z10 = false;
                }
                if (z10) {
                    final TextFieldSelectionManager textFieldSelectionManager5 = this.this$0;
                    aVar5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$paste$1

                        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$paste$1$1, reason: invalid class name */
                        /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
                        @Aa.c(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$paste$1$1", f = "TextFieldSelectionManager.kt", l = {}, m = "invokeSuspend")
                        final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                            int label;
                            final /* synthetic */ TextFieldSelectionManager this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(TextFieldSelectionManager textFieldSelectionManager, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                                super(2, cVar);
                                this.this$0 = textFieldSelectionManager;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                                return new AnonymousClass1(this.this$0, cVar);
                            }

                            @Override // Ia.p
                            public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                                return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj);
                                this.this$0.n();
                                return p293xa.r.f47939a;
                            }
                        }

                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final p293xa.r invoke() {
                            TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager5;
                            A a10 = textFieldSelectionManager6.f11560i;
                            if (a10 != null) {
                                C2680e.c(a10, null, CoroutineStart.f43169e, new AnonymousClass1(textFieldSelectionManager6, null), 1);
                            }
                            textFieldSelectionManager5.m();
                            return p293xa.r.f47939a;
                        }
                    };
                    aVar4 = aVar;
                } else {
                    aVar4 = aVar;
                    aVar5 = null;
                }
            } else {
                aVar4 = aVar;
                aVar5 = null;
            }
            aVar6 = aVar2;
            if (androidx.compose.ui.text.E.c(this.this$0.l().f15492b) != this.this$0.l().f15491a.f15408c.length()) {
                final TextFieldSelectionManager textFieldSelectionManager6 = this.this$0;
                aVar7 = new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$selectAll$1
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        textFieldSelectionManager6.o();
                        return p293xa.r.f47939a;
                    }
                };
            } else {
                aVar7 = null;
            }
            if (this.this$0.i() || !androidx.compose.ui.text.E.b(this.this$0.l().f15492b)) {
                aVar8 = null;
            } else {
                final TextFieldSelectionManager textFieldSelectionManager7 = this.this$0;
                aVar8 = new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$autofill$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [Ia.a, kotlin.jvm.internal.Lambda] */
                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        ?? r10 = textFieldSelectionManager7.f11558g;
                        if (r10 != 0) {
                            r10.invoke();
                        }
                        return p293xa.r.f47939a;
                    }
                };
            }
            textFieldSelectionManager = this.this$0;
            p10 = textFieldSelectionManager.j;
            if (p10 != null) {
                legacyTextFieldState2 = textFieldSelectionManager.f11555d;
                if (legacyTextFieldState2 == null) {
                    p10 = p10;
                    aVar8 = aVar8;
                    fVar = I.f.f3756e;
                } else {
                    legacyTextFieldState3 = legacyTextFieldState2.f11191p ? null : legacyTextFieldState2;
                    if (legacyTextFieldState3 != null) {
                        int iB = textFieldSelectionManager.f11553b.b((int) (textFieldSelectionManager.l().f15492b >> 32));
                        int iB2 = textFieldSelectionManager.f11553b.b((int) (textFieldSelectionManager.l().f15492b & 4294967295L));
                        legacyTextFieldState4 = textFieldSelectionManager.f11555d;
                        long jG1 = 0;
                        if (legacyTextFieldState4 != null || (interfaceC1170pC4 = legacyTextFieldState4.c()) == null) {
                            jG0 = 0;
                        } else {
                            jG0 = interfaceC1170pC4.g0(textFieldSelectionManager.k(true));
                        }
                        legacyTextFieldState5 = textFieldSelectionManager.f11555d;
                        if (legacyTextFieldState5 == null && (interfaceC1170pC3 = legacyTextFieldState5.c()) != null) {
                            jG1 = interfaceC1170pC3.g0(textFieldSelectionManager.k(false));
                        }
                        legacyTextFieldState6 = textFieldSelectionManager.f11555d;
                        if (legacyTextFieldState6 != null || (interfaceC1170pC2 = legacyTextFieldState6.c()) == null) {
                            fIntBitsToFloat = 0.0f;
                        } else {
                            androidx.compose.foundation.text.A aD = legacyTextFieldState3.d();
                            fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1170pC2.g0((((long) Float.floatToRawIntBits((aD == null || (b11 = aD.f11055a) == null) ? 0.0f : b11.c(iB).f3758b)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                        }
                        legacyTextFieldState7 = textFieldSelectionManager.f11555d;
                        if (legacyTextFieldState7 != null || (interfaceC1170pC = legacyTextFieldState7.c()) == null) {
                            fIntBitsToFloat2 = 0.0f;
                        } else {
                            androidx.compose.foundation.text.A aD2 = legacyTextFieldState3.d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC1170pC.g0((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((aD2 == null || (b10 = aD2.f11055a) == null) ? 0.0f : b10.c(iB2).f3758b)) & 4294967295L)) & 4294967295L));
                        }
                        int i11 = (int) (jG0 >> 32);
                        int i12 = (int) (jG1 >> 32);
                        fVar = new I.f(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), (legacyTextFieldState3.f11177a.f11526g.getDensity() * 25) + Math.max(Float.intBitsToFloat((int) (jG0 & 4294967295L)), Float.intBitsToFloat((int) (jG1 & 4294967295L))));
                    } else {
                        p10 = p10;
                        aVar8 = aVar8;
                        fVar = I.f.f3756e;
                    }
                }
                p10.f(fVar, aVar4, aVar5, aVar6, aVar7, aVar8);
            }
            return p293xa.r.f47939a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aVar3 = (Ia.a) this.L$1;
        aVar = (Ia.a) this.L$0;
        kotlin.b.b(obj);
        objB = obj;
        Y y10 = (Y) objB;
        if (y10 == null || !y10.f15013a.getDescription().hasMimeType("text/*")) {
            aVar2 = aVar3;
            z10 = false;
        } else {
            aVar2 = aVar3;
            z10 = true;
        }
        if (z10) {
            final TextFieldSelectionManager textFieldSelectionManager8 = this.this$0;
            aVar5 = new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$paste$1

                /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$paste$1$1, reason: invalid class name */
                /* JADX INFO: compiled from: TextFieldSelectionManager.kt */
                @Aa.c(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$paste$1$1", f = "TextFieldSelectionManager.kt", l = {}, m = "invokeSuspend")
                final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                    int label;
                    final /* synthetic */ TextFieldSelectionManager this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TextFieldSelectionManager textFieldSelectionManager, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.this$0 = textFieldSelectionManager;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                        return new AnonymousClass1(this.this$0, cVar);
                    }

                    @Override // Ia.p
                    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                        return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.b.b(obj);
                        this.this$0.n();
                        return p293xa.r.f47939a;
                    }
                }

                {
                    super(0);
                }

                @Override // Ia.a
                public final p293xa.r invoke() {
                    TextFieldSelectionManager textFieldSelectionManager9 = textFieldSelectionManager8;
                    A a10 = textFieldSelectionManager9.f11560i;
                    if (a10 != null) {
                        C2680e.c(a10, null, CoroutineStart.f43169e, new AnonymousClass1(textFieldSelectionManager9, null), 1);
                    }
                    textFieldSelectionManager8.m();
                    return p293xa.r.f47939a;
                }
            };
            aVar4 = aVar;
        } else {
            aVar4 = aVar;
            aVar5 = null;
        }
        aVar6 = aVar2;
        if (androidx.compose.ui.text.E.c(this.this$0.l().f15492b) != this.this$0.l().f15491a.f15408c.length()) {
            final TextFieldSelectionManager textFieldSelectionManager9 = this.this$0;
            aVar7 = new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$selectAll$1
                {
                    super(0);
                }

                @Override // Ia.a
                public final p293xa.r invoke() {
                    textFieldSelectionManager9.o();
                    return p293xa.r.f47939a;
                }
            };
        } else {
            aVar7 = null;
        }
        if (this.this$0.i()) {
            aVar8 = null;
        } else {
            aVar8 = null;
        }
        textFieldSelectionManager = this.this$0;
        p10 = textFieldSelectionManager.j;
        if (p10 != null) {
            legacyTextFieldState2 = textFieldSelectionManager.f11555d;
            if (legacyTextFieldState2 == null) {
                p10 = p10;
                aVar8 = aVar8;
                fVar = I.f.f3756e;
            } else {
                if (legacyTextFieldState2.f11191p) {
                }
                if (legacyTextFieldState3 != null) {
                    int iB3 = textFieldSelectionManager.f11553b.b((int) (textFieldSelectionManager.l().f15492b >> 32));
                    int iB4 = textFieldSelectionManager.f11553b.b((int) (textFieldSelectionManager.l().f15492b & 4294967295L));
                    legacyTextFieldState4 = textFieldSelectionManager.f11555d;
                    long jG2 = 0;
                    if (legacyTextFieldState4 != null) {
                        jG0 = 0;
                    } else {
                        jG0 = 0;
                    }
                    legacyTextFieldState5 = textFieldSelectionManager.f11555d;
                    if (legacyTextFieldState5 == null) {
                    }
                    legacyTextFieldState6 = textFieldSelectionManager.f11555d;
                    if (legacyTextFieldState6 != null) {
                        fIntBitsToFloat = 0.0f;
                    } else {
                        fIntBitsToFloat = 0.0f;
                    }
                    legacyTextFieldState7 = textFieldSelectionManager.f11555d;
                    if (legacyTextFieldState7 != null) {
                        fIntBitsToFloat2 = 0.0f;
                    } else {
                        fIntBitsToFloat2 = 0.0f;
                    }
                    int i13 = (int) (jG0 >> 32);
                    int i14 = (int) (jG2 >> 32);
                    fVar = new I.f(Math.min(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), (legacyTextFieldState3.f11177a.f11526g.getDensity() * 25) + Math.max(Float.intBitsToFloat((int) (jG0 & 4294967295L)), Float.intBitsToFloat((int) (jG2 & 4294967295L))));
                } else {
                    p10 = p10;
                    aVar8 = aVar8;
                    fVar = I.f.f3756e;
                }
            }
            p10.f(fVar, aVar4, aVar5, aVar6, aVar7, aVar8);
        }
        return p293xa.r.f47939a;
    }
}
