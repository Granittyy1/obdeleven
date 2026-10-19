package io.intercom.android.sdk.m5.data;

import Aa.c;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.UsersResponse;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CommonRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CommonRepository {
    public static final int $stable = 8;
    private final IntercomDataLayer intercomDataLayer;
    private final MessengerApi messengerApi;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.CommonRepository$fetchUnreadCounts$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonRepository.kt */
    @c(c = "io.intercom.android.sdk.m5.data.CommonRepository", f = "CommonRepository.kt", l = {27}, m = "fetchUnreadCounts")
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonRepository.this.fetchUnreadCounts(this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.data.CommonRepository$openMessenger$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonRepository.kt */
    @c(c = "io.intercom.android.sdk.m5.data.CommonRepository", f = "CommonRepository.kt", l = {17}, m = "openMessenger")
    public static final class C24111 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C24111(kotlin.coroutines.c<? super C24111> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonRepository.this.openMessenger(this);
        }
    }

    public CommonRepository(MessengerApi messengerApi, IntercomDataLayer intercomDataLayer) {
        i.e(messengerApi, "messengerApi");
        i.e(intercomDataLayer, "intercomDataLayer");
        this.messengerApi = messengerApi;
        this.intercomDataLayer = intercomDataLayer;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchUnreadCounts(kotlin.coroutines.c<? super UsersResponse> cVar) {
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
        Object unreadConversationsSuspended$default = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            b.b(unreadConversationsSuspended$default);
            MessengerApi messengerApi = this.messengerApi;
            anonymousClass1.label = 1;
            unreadConversationsSuspended$default = MessengerApi.DefaultImpls.getUnreadConversationsSuspended$default(messengerApi, null, anonymousClass1, 1, null);
            if (unreadConversationsSuspended$default == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(unreadConversationsSuspended$default);
        }
        NetworkResponse networkResponse = (NetworkResponse) unreadConversationsSuspended$default;
        if (networkResponse instanceof NetworkResponse.Success) {
            return ((UsersResponse.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object openMessenger(kotlin.coroutines.c<? super OpenMessengerResponse> cVar) {
        C24111 c24111;
        CommonRepository commonRepository;
        if (cVar instanceof C24111) {
            c24111 = (C24111) cVar;
            int i10 = c24111.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c24111.label = i10 - Integer.MIN_VALUE;
            } else {
                c24111 = new C24111(cVar);
            }
        } else {
            c24111 = new C24111(cVar);
        }
        Object objOpenMessengerSuspended$default = c24111.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = c24111.label;
        if (i11 == 0) {
            b.b(objOpenMessengerSuspended$default);
            OpenMessengerResponse openResponse = this.intercomDataLayer.getOpenResponse();
            if (openResponse != null) {
                return openResponse;
            }
            MessengerApi messengerApi = this.messengerApi;
            c24111.L$0 = this;
            c24111.label = 1;
            objOpenMessengerSuspended$default = MessengerApi.DefaultImpls.openMessengerSuspended$default(messengerApi, null, c24111, 1, null);
            if (objOpenMessengerSuspended$default == coroutineSingletons) {
                return coroutineSingletons;
            }
            commonRepository = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            commonRepository = (CommonRepository) c24111.L$0;
            b.b(objOpenMessengerSuspended$default);
        }
        NetworkResponse networkResponse = (NetworkResponse) objOpenMessengerSuspended$default;
        if (!(networkResponse instanceof NetworkResponse.Success)) {
            return null;
        }
        NetworkResponse.Success success = (NetworkResponse.Success) networkResponse;
        commonRepository.intercomDataLayer.updateOpenResponse((OpenMessengerResponse) success.getBody());
        return (OpenMessengerResponse) success.getBody();
    }
}
