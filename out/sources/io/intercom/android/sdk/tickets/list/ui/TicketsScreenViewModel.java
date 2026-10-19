package io.intercom.android.sdk.tickets.list.ui;

import androidx.lifecycle.InterfaceC1369l;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.paging.C1426b;
import androidx.paging.PageEvent;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import androidx.paging.v;
import androidx.paging.w;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import io.intercom.android.sdk.tickets.list.data.TicketsPagingSource;
import io.intercom.android.sdk.tickets.list.reducers.TicketRowReducerKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.u;
import me.zhanghai.android.materialprogressbar.R;
import p037cb.C1532j0;
import p293xa.r;

/* JADX INFO: compiled from: TicketsScreenViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketsScreenViewModel extends Y {
    private final p<TicketsScreenEffects> _effect;
    private final u<TicketsScreenEffects> effect;
    private final InterfaceC2686c<PagingData<TicketRowData>> pagerFlow;
    private final TicketRepository repository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: TicketsScreenViewModel.kt */
    @Aa.c(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2", f = "TicketsScreenViewModel.kt", l = {R.styleable.AppCompatTheme_checkedTextViewStyle}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass2(kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return TicketsScreenViewModel.this.new AnonymousClass2(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                final InterfaceC2686c<ParsedNexusEvent> interfaceC2686cRealTimeEvents = TicketsScreenViewModel.this.repository.realTimeEvents();
                final InterfaceC2686c<Object> interfaceC2686c = new InterfaceC2686c<Object>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Aa.c(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "TicketsScreenViewModel.kt", l = {219}, m = "emit")
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(kotlin.coroutines.c cVar) {
                                super(cVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC2687d interfaceC2687d) {
                            this.$this_unsafeFlow = interfaceC2687d;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.InterfaceC2687d
                        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i10 = anonymousClass1.label;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(cVar);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(cVar);
                            }
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                kotlin.b.b(obj2);
                                InterfaceC2687d interfaceC2687d = this.$this_unsafeFlow;
                                if (obj instanceof ParsedNexusEvent.ConversationNexusEvent.NewComment) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2687d.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj2);
                            }
                            return r.f47939a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2686c
                    public Object collect(InterfaceC2687d<? super Object> interfaceC2687d, kotlin.coroutines.c cVar) {
                        Object objCollect = interfaceC2686cRealTimeEvents.collect(new AnonymousClass2(interfaceC2687d), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
                    }
                };
                InterfaceC2686c<ParsedNexusEvent.ConversationNexusEvent.NewComment> interfaceC2686c2 = new InterfaceC2686c<ParsedNexusEvent.ConversationNexusEvent.NewComment>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Aa.c(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2$invokeSuspend$$inlined$filter$1$2", f = "TicketsScreenViewModel.kt", l = {219}, m = "emit")
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(kotlin.coroutines.c cVar) {
                                super(cVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC2687d interfaceC2687d) {
                            this.$this_unsafeFlow = interfaceC2687d;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.InterfaceC2687d
                        public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i10 = anonymousClass1.label;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(cVar);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(cVar);
                            }
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                kotlin.b.b(obj2);
                                InterfaceC2687d interfaceC2687d = this.$this_unsafeFlow;
                                String ticketId = ((ParsedNexusEvent.ConversationNexusEvent.NewComment) obj).getTicketId();
                                if (!(ticketId == null || ticketId.length() == 0)) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2687d.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.b.b(obj2);
                            }
                            return r.f47939a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2686c
                    public Object collect(InterfaceC2687d<? super ParsedNexusEvent.ConversationNexusEvent.NewComment> interfaceC2687d, kotlin.coroutines.c cVar) {
                        Object objCollect = interfaceC2686c.collect(new AnonymousClass2(interfaceC2687d), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
                    }
                };
                final TicketsScreenViewModel ticketsScreenViewModel = TicketsScreenViewModel.this;
                InterfaceC2687d<? super ParsedNexusEvent.ConversationNexusEvent.NewComment> interfaceC2687d = new InterfaceC2687d() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel.2.2
                    @Override // kotlinx.coroutines.flow.InterfaceC2687d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent.NewComment) obj2, (kotlin.coroutines.c<? super r>) cVar);
                    }

                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent.NewComment newComment, kotlin.coroutines.c<? super r> cVar) {
                        Object objEmit = ticketsScreenViewModel._effect.emit(TicketsScreenEffects.RefreshTickets.INSTANCE, cVar);
                        return objEmit == CoroutineSingletons.f43038b ? objEmit : r.f47939a;
                    }
                };
                this.label = 1;
                if (interfaceC2686c2.collect(interfaceC2687d, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass2) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    /* JADX INFO: compiled from: TicketsScreenViewModel.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$Companion$factory$1] */
        private final TicketsScreenViewModel$Companion$factory$1 factory() {
            return new a0.c() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$Companion$factory$1
                @Override // androidx.lifecycle.a0.c
                public /* bridge */ /* synthetic */ Y create(Oa.c cVar, p014b1.a aVar) {
                    return super.create(cVar, aVar);
                }

                @Override // androidx.lifecycle.a0.c
                public /* bridge */ /* synthetic */ Y create(Class cls, p014b1.a aVar) {
                    return super.create(cls, aVar);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.a0.c
                public <T extends Y> T create(Class<T> modelClass) {
                    i.e(modelClass, "modelClass");
                    return new TicketsScreenViewModel(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }
            };
        }

        public final TicketsScreenViewModel create(c0 owner) {
            i.e(owner, "owner");
            TicketsScreenViewModel$Companion$factory$1 factory = factory();
            i.e(factory, "factory");
            b0 store = owner.getViewModelStore();
            p014b1.a defaultCreationExtras = owner instanceof InterfaceC1369l ? ((InterfaceC1369l) owner).getDefaultViewModelCreationExtras() : p014b1.a.C0207a.f20498b;
            i.e(store, "store");
            i.e(defaultCreationExtras, "defaultCreationExtras");
            p014b1.f fVar = new p014b1.f(store, factory, defaultCreationExtras);
            kotlin.jvm.internal.c cVarA = l.a(TicketsScreenViewModel.class);
            String strI = cVarA.i();
            if (strI != null) {
                return (TicketsScreenViewModel) fVar.a(cVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TicketsScreenViewModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource _init_$lambda$0(TicketRepository repository) {
        i.e(repository, "$repository");
        return new TicketsPagingSource(repository);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object pagerFlow$lambda$1$reduceTicketRowData(Ticket ticket, kotlin.coroutines.c cVar) {
        return TicketRowReducerKt.reduceTicketRowData(ticket);
    }

    public final u<TicketsScreenEffects> getEffect() {
        return this.effect;
    }

    public final InterfaceC2686c<PagingData<TicketRowData>> getPagerFlow() {
        return this.pagerFlow;
    }

    public /* synthetic */ TicketsScreenViewModel(TicketRepository ticketRepository, v vVar, int i10, kotlin.jvm.internal.e eVar) {
        if ((i10 & 1) != 0) {
            ticketRepository = new TicketRepository(null, null, null, null, 15, null);
        }
        this(ticketRepository, (i10 & 2) != 0 ? new v(new w(10), new C1532j0(4, ticketRepository)) : vVar);
    }

    public TicketsScreenViewModel(TicketRepository repository, v<Long, Ticket> pager) {
        i.e(repository, "repository");
        i.e(pager, "pager");
        this.repository = repository;
        final InterfaceC2686c<PagingData<Ticket>> interfaceC2686c = pager.f19431a;
        this.pagerFlow = C1426b.a(new InterfaceC2686c<PagingData<TicketRowData>>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements InterfaceC2687d {
                final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                /* JADX INFO: renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Aa.c(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1$2", f = "TicketsScreenViewModel.kt", l = {219}, m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2687d interfaceC2687d) {
                    this.$this_unsafeFlow = interfaceC2687d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC2687d
                public final Object emit(Object obj, kotlin.coroutines.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i10 = anonymousClass1.label;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(cVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(cVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        kotlin.b.b(obj2);
                        InterfaceC2687d interfaceC2687d = this.$this_unsafeFlow;
                        PagingData pagingData = (PagingData) obj;
                        final TicketsScreenViewModel$pagerFlow$1$1 transform = TicketsScreenViewModel$pagerFlow$1$1.INSTANCE;
                        i.e(pagingData, "<this>");
                        i.e(transform, "transform");
                        final InterfaceC2686c<PageEvent<T>> interfaceC2686c = pagingData.f19288a;
                        PagingData pagingData2 = new PagingData(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004f: CONSTRUCTOR (r4v2 'pagingData2' androidx.paging.PagingData) = 
                              (wrap kotlinx.coroutines.flow.c:0x0048: CONSTRUCTOR 
                              (r2v1 'transform' io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$pagerFlow$1$1 A[DONT_INLINE])
                              (r6v0 'interfaceC2686c' kotlinx.coroutines.flow.c<androidx.paging.PageEvent<T>> A[DONT_INLINE])
                             A[MD:(Ia.p, kotlinx.coroutines.flow.c):void (m), WRAPPED] (LINE:73) call: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1.<init>(Ia.p, kotlinx.coroutines.flow.c):void type: CONSTRUCTOR)
                              (wrap androidx.paging.G:0x004b: IGET (r8v1 'pagingData' androidx.paging.PagingData) A[WRAPPED] (LINE:76) androidx.paging.PagingData.b androidx.paging.G)
                              (wrap androidx.paging.j:0x004d: IGET (r8v1 'pagingData' androidx.paging.PagingData) A[WRAPPED] (LINE:78) androidx.paging.PagingData.c androidx.paging.j)
                             A[DECLARE_VAR, MD:(kotlinx.coroutines.flow.c, androidx.paging.G, androidx.paging.j):void (m)] (LINE:80) call: androidx.paging.PagingData.<init>(kotlinx.coroutines.flow.c, androidx.paging.G, androidx.paging.j):void type: CONSTRUCTOR in method: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object, file: classes3.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:320)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:297)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:487)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:782)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 96 more
                            */
                        /*
                            this = this;
                            boolean r0 = r9 instanceof io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r9
                            io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1$2$1 r0 = (io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1$2$1 r0 = new io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1$2$1
                            r0.<init>(r9)
                        L18:
                            java.lang.Object r9 = r0.result
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            kotlin.b.b(r9)
                            goto L5b
                        L27:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r9)
                            throw r8
                        L2f:
                            kotlin.b.b(r9)
                            kotlinx.coroutines.flow.d r9 = r7.$this_unsafeFlow
                            androidx.paging.PagingData r8 = (androidx.paging.PagingData) r8
                            io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$pagerFlow$1$1 r2 = io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$pagerFlow$1$1.INSTANCE
                            java.lang.String r4 = "<this>"
                            kotlin.jvm.internal.i.e(r8, r4)
                            java.lang.String r4 = "transform"
                            kotlin.jvm.internal.i.e(r2, r4)
                            androidx.paging.PagingData r4 = new androidx.paging.PagingData
                            androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1 r5 = new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1
                            kotlinx.coroutines.flow.c<androidx.paging.PageEvent<T>> r6 = r8.f19288a
                            r5.<init>(r2, r6)
                            androidx.paging.G r2 = r8.f19289b
                            androidx.paging.j r8 = r8.f19290c
                            r4.<init>(r5, r2, r8)
                            r0.label = r3
                            java.lang.Object r8 = r9.emit(r4, r0)
                            if (r8 != r1) goto L5b
                            return r1
                        L5b:
                            xa.r r8 = p293xa.r.f47939a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.InterfaceC2686c
                public Object collect(InterfaceC2687d<? super PagingData<TicketRowData>> interfaceC2687d, kotlin.coroutines.c cVar) {
                    Object objCollect = interfaceC2686c.collect(new AnonymousClass2(interfaceC2687d), cVar);
                    return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
                }
            }, Z.a(this));
            kotlinx.coroutines.flow.v vVarB = kotlinx.coroutines.flow.w.b(0, 0, null, 7);
            this._effect = vVarB;
            this.effect = C2688e.p(vVarB, Z.a(this));
            C2680e.c(Z.a(this), null, null, new AnonymousClass2(null), 3);
        }
    }
