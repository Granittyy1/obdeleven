package androidx.lifecycle;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.sync.MutexImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: RepeatOnLifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingLeft}, m = "invokeSuspend")
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
    @Aa.c(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ kotlinx.coroutines.A $$this$coroutineScope;
        final /* synthetic */ Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, kotlinx.coroutines.A a10, Ia.p<? super kotlinx.coroutines.A, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$$this$coroutineScope = a10;
            this.$block = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, cVar);
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v0, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, androidx.lifecycle.s] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref$ObjectRef ref$ObjectRef;
            Ref$ObjectRef ref$ObjectRef2;
            InterfaceC2694i0 interfaceC2694i0;
            r rVar;
            InterfaceC2694i0 interfaceC2694i1;
            r rVar2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
                ref$ObjectRef = (Ref$ObjectRef) this.L$0;
                try {
                    kotlin.b.b(obj);
                    interfaceC2694i1 = (InterfaceC2694i0) ref$ObjectRef.element;
                    if (interfaceC2694i1 != null) {
                        interfaceC2694i1.i(null);
                    }
                    rVar2 = (r) ref$ObjectRef2.element;
                    if (rVar2 != null) {
                        this.$this_repeatOnLifecycle.c(rVar2);
                    }
                    return p293xa.r.f47939a;
                } catch (Throwable th) {
                    th = th;
                    interfaceC2694i0 = (InterfaceC2694i0) ref$ObjectRef.element;
                    if (interfaceC2694i0 != null) {
                        interfaceC2694i0.i(null);
                    }
                    rVar = (r) ref$ObjectRef2.element;
                    if (rVar != null) {
                        this.$this_repeatOnLifecycle.c(rVar);
                    }
                    throw th;
                }
            }
            kotlin.b.b(obj);
            if (this.$this_repeatOnLifecycle.b() == Lifecycle.State.f17749b) {
                return p293xa.r.f47939a;
            }
            final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
            Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
            try {
                Lifecycle.State state = this.$state;
                Lifecycle lifecycle = this.$this_repeatOnLifecycle;
                final kotlinx.coroutines.A a10 = this.$$this$coroutineScope;
                final Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> pVar = this.$block;
                this.L$0 = ref$ObjectRef3;
                this.L$1 = ref$ObjectRef4;
                this.L$2 = state;
                this.L$3 = lifecycle;
                this.L$4 = a10;
                this.L$5 = pVar;
                this.label = 1;
                final C2693i c2693i = new C2693i(1, A8.p.y(this));
                c2693i.s();
                Lifecycle.Event.Companion.getClass();
                final Lifecycle.Event eventC = Lifecycle.Event.a.c(state);
                final Lifecycle.Event eventA = Lifecycle.Event.a.a(state);
                final MutexImpl mutexImplA = kotlinx.coroutines.sync.b.a();
                ?? r15 = new r() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1

                    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
                    @Aa.c(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {166, R.styleable.AppCompatTheme_textColorAlertDialogListItem}, m = "invokeSuspend")
                    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
                        final /* synthetic */ Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
                        final /* synthetic */ kotlinx.coroutines.sync.a $mutex;
                        Object L$0;
                        Object L$1;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public AnonymousClass1(kotlinx.coroutines.sync.a aVar, Ia.p<? super kotlinx.coroutines.A, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                            super(2, cVar);
                            this.$mutex = aVar;
                            this.$block = pVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                            return new AnonymousClass1(this.$mutex, this.$block, cVar);
                        }

                        @Override // Ia.p
                        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
                            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            kotlinx.coroutines.sync.a aVar;
                            Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> pVar;
                            kotlinx.coroutines.sync.a aVar2;
                            Throwable th;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            int i10 = this.label;
                            try {
                                if (i10 == 0) {
                                    kotlin.b.b(obj);
                                    aVar = this.$mutex;
                                    pVar = this.$block;
                                    this.L$0 = aVar;
                                    this.L$1 = pVar;
                                    this.label = 1;
                                    if (aVar.f(null, this) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    if (i10 != 1) {
                                        if (i10 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        aVar2 = (kotlinx.coroutines.sync.a) this.L$0;
                                        try {
                                            kotlin.b.b(obj);
                                            p293xa.r rVar = p293xa.r.f47939a;
                                            aVar2.g(null);
                                            return p293xa.r.f47939a;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            aVar2.g(null);
                                            throw th;
                                        }
                                    }
                                    pVar = (Ia.p) this.L$1;
                                    kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.L$0;
                                    kotlin.b.b(obj);
                                    aVar = aVar3;
                                }
                                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(pVar, null);
                                this.L$0 = aVar;
                                this.L$1 = null;
                                this.label = 2;
                                if (kotlinx.coroutines.B.d(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                aVar2 = aVar;
                                p293xa.r rVar2 = p293xa.r.f47939a;
                                aVar2.g(null);
                                return p293xa.r.f47939a;
                            } catch (Throwable th3) {
                                aVar2 = aVar;
                                th = th3;
                                aVar2.g(null);
                                throw th;
                            }
                        }
                    }

                    /* JADX WARN: Type inference failed for: r5v3, types: [T, kotlinx.coroutines.z0] */
                    @Override // androidx.lifecycle.r
                    public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
                        Ref$ObjectRef<InterfaceC2694i0> ref$ObjectRef5 = ref$ObjectRef3;
                        if (event == eventC) {
                            ref$ObjectRef5.element = C2680e.c(a10, null, null, new AnonymousClass1(mutexImplA, pVar, null), 3);
                            return;
                        }
                        if (event == eventA) {
                            InterfaceC2694i0 interfaceC2694i2 = ref$ObjectRef5.element;
                            if (interfaceC2694i2 != null) {
                                interfaceC2694i2.i(null);
                            }
                            ref$ObjectRef5.element = null;
                        }
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            c2693i.resumeWith(p293xa.r.f47939a);
                        }
                    }
                };
                ref$ObjectRef4.element = r15;
                lifecycle.a(r15);
                if (c2693i.p() == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef = ref$ObjectRef3;
                ref$ObjectRef2 = ref$ObjectRef4;
                interfaceC2694i1 = (InterfaceC2694i0) ref$ObjectRef.element;
                if (interfaceC2694i1 != null) {
                    interfaceC2694i1.i(null);
                }
                rVar2 = (r) ref$ObjectRef2.element;
                if (rVar2 != null) {
                    this.$this_repeatOnLifecycle.c(rVar2);
                }
                return p293xa.r.f47939a;
            } catch (Throwable th2) {
                th = th2;
                ref$ObjectRef = ref$ObjectRef3;
                ref$ObjectRef2 = ref$ObjectRef4;
                interfaceC2694i0 = (InterfaceC2694i0) ref$ObjectRef.element;
                if (interfaceC2694i0 != null) {
                    interfaceC2694i0.i(null);
                }
                rVar = (r) ref$ObjectRef2.element;
                if (rVar != null) {
                    this.$this_repeatOnLifecycle.c(rVar);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, Ia.p<? super kotlinx.coroutines.A, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> cVar) {
        super(2, cVar);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, cVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.L$0;
            Sa.b bVar = kotlinx.coroutines.N.f43198a;
            q0 q0VarD1 = kotlinx.coroutines.internal.q.f43500a.d1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, a10, this.$block, null);
            this.label = 1;
            if (C2680e.f(q0VarD1, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
