package io.intercom.android.sdk.utilities;

import Aa.c;
import Ia.p;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.internal.q;
import kotlinx.coroutines.q0;
import p293xa.r;

/* JADX INFO: compiled from: FirstMessageUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FirstMessageUtilsKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1, reason: invalid class name */
    /* JADX INFO: compiled from: FirstMessageUtils.kt */
    @c(c = "io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1", f = "FirstMessageUtils.kt", l = {27}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ IntercomDataLayer $dataLayer;
        final /* synthetic */ Twig $twig;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IntercomDataLayer intercomDataLayer, Twig twig, Context context, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$dataLayer = intercomDataLayer;
            this.$twig = twig;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$dataLayer, this.$twig, this.$context, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                final u<IntercomEvent> event = this.$dataLayer.getEvent();
                InterfaceC2686c<Object> interfaceC2686c = new InterfaceC2686c<Object>() { // from class: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements InterfaceC2687d {
                        final /* synthetic */ InterfaceC2687d $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @c(c = "io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "FirstMessageUtils.kt", l = {219}, m = "emit")
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
                                b.b(obj2);
                                InterfaceC2687d interfaceC2687d = this.$this_unsafeFlow;
                                if (obj instanceof IntercomEvent.BaseResponseReceived) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2687d.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                b.b(obj2);
                            }
                            return r.f47939a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC2686c
                    public Object collect(InterfaceC2687d<? super Object> interfaceC2687d, kotlin.coroutines.c cVar) {
                        Object objCollect = event.collect(new AnonymousClass2(interfaceC2687d), cVar);
                        return objCollect == CoroutineSingletons.f43038b ? objCollect : r.f47939a;
                    }
                };
                C04531 c04531 = new C04531(this.$twig, this.$context);
                this.label = 1;
                if (interfaceC2686c.collect(c04531, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }

        /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: FirstMessageUtils.kt */
        public static final class C04531<T> implements InterfaceC2687d {
            final /* synthetic */ Context $context;
            final /* synthetic */ Twig $twig;

            /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: FirstMessageUtils.kt */
            @c(c = "io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1$1", f = "FirstMessageUtils.kt", l = {}, m = "invokeSuspend")
            public static final class C04541 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
                final /* synthetic */ Context $context;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04541(Context context, kotlin.coroutines.c<? super C04541> cVar) {
                    super(2, cVar);
                    this.$context = context;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                    return new C04541(this.$context, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.b(obj);
                    FirstMessageUtilsKt.showFirstMessageToast(this.$context);
                    return r.f47939a;
                }

                @Override // Ia.p
                public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
                    return ((C04541) create(a10, cVar)).invokeSuspend(r.f47939a);
                }
            }

            public C04531(Twig twig, Context context) {
                this.$twig = twig;
                this.$context = context;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object emit(IntercomEvent.BaseResponseReceived baseResponseReceived, kotlin.coroutines.c<? super r> cVar) {
                FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1;
                Exception e10;
                C04531<T> c04531;
                if (cVar instanceof FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1) {
                    firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 = (FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1) cVar;
                    int i10 = firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.label;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.label = i10 - Integer.MIN_VALUE;
                    } else {
                        firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 = new FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1(this, cVar);
                    }
                } else {
                    firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 = new FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1(this, cVar);
                }
                Object obj = firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i11 = firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.label;
                if (i11 == 0) {
                    b.b(obj);
                    if (baseResponseReceived.getBaseResponse().getConfig().isFirstRequest()) {
                        this.$twig.i(this.$context.getString(R.string.intercom_android_activated_message), new Object[0]);
                        try {
                            Sa.b bVar = N.f43198a;
                            q0 q0Var = q.f43500a;
                            try {
                                C04541 c04541 = new C04541(this.$context, null);
                                firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.L$0 = this;
                                firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.label = 1;
                                if (C2680e.f(q0Var, c04541, firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } catch (Exception e11) {
                                e10 = e11;
                                c04531 = this;
                                c04531.$twig.internal("Couldn't show first message toast: " + e10.getMessage());
                            }
                        } catch (Exception e12) {
                            e10 = e12;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c04531 = (C04531) firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.L$0;
                    try {
                        b.b(obj);
                    } catch (Exception e13) {
                        e10 = e13;
                        c04531.$twig.internal("Couldn't show first message toast: " + e10.getMessage());
                    }
                }
                return r.f47939a;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2687d
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
                return emit((IntercomEvent.BaseResponseReceived) obj, (kotlin.coroutines.c<? super r>) cVar);
            }
        }
    }

    public static final void handleFirstMessageToast(A applicationScope, Twig twig, Context context, IntercomDataLayer dataLayer) {
        i.e(applicationScope, "applicationScope");
        i.e(twig, "twig");
        i.e(context, "context");
        i.e(dataLayer, "dataLayer");
        C2680e.c(applicationScope, null, null, new AnonymousClass1(dataLayer, twig, context, null), 3);
    }

    public static final void showFirstMessageToast(Context context) {
        i.e(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.intercom_onboarding_layout, (ViewGroup) null);
        Toast toast = new Toast(context);
        toast.setGravity(17, 0, 0);
        toast.setDuration(1);
        toast.setView(viewInflate);
        toast.show();
    }
}
