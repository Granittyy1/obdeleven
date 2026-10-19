package io.intercom.android.sdk.m5.inbox.data;

import Ia.p;
import androidx.paging.PagingSource;
import androidx.paging.y;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationList;
import io.intercom.android.sdk.models.ConversationsResponse;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.collections.q;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: InboxPagingSource.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InboxPagingSource extends PagingSource<Long, Conversation> {
    public static final int PAGE_SIZE = 20;
    private final InboxRepository inboxRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final p<EmptyState, c<? super r>, Object> onEmptyState;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: InboxPagingSource.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.inbox.data.InboxPagingSource$load$1, reason: invalid class name */
    /* JADX INFO: compiled from: InboxPagingSource.kt */
    @Aa.c(c = "io.intercom.android.sdk.m5.inbox.data.InboxPagingSource", f = "InboxPagingSource.kt", l = {18, R.styleable.AppCompatTheme_actionOverflowButtonStyle}, m = "load")
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InboxPagingSource.this.load(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InboxPagingSource(InboxRepository inboxRepository, IntercomDataLayer intercomDataLayer, p<? super EmptyState, ? super c<? super r>, ? extends Object> onEmptyState) {
        i.e(inboxRepository, "inboxRepository");
        i.e(intercomDataLayer, "intercomDataLayer");
        i.e(onEmptyState, "onEmptyState");
        this.inboxRepository = inboxRepository;
        this.intercomDataLayer = intercomDataLayer;
        this.onEmptyState = onEmptyState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.PagingSource
    public Long getRefreshKey(y<Long, Conversation> state) {
        i.e(state, "state");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.paging.PagingSource
    public Object load(PagingSource.a<Long> aVar, c<? super PagingSource.b<Long, Conversation>> cVar) {
        AnonymousClass1 anonymousClass1;
        InboxPagingSource inboxPagingSource;
        PagingSource.b.a aVar2;
        ConversationList conversationList;
        InboxPagingSource inboxPagingSource2;
        int i10;
        List<Conversation> conversations;
        Long l10;
        Conversation conversation;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object conversations2 = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = anonymousClass1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                aVar = (PagingSource.a) anonymousClass1.L$1;
                inboxPagingSource = (InboxPagingSource) anonymousClass1.L$0;
                b.b(conversations2);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = anonymousClass1.I$0;
                conversationList = (ConversationList) anonymousClass1.L$1;
                inboxPagingSource2 = (InboxPagingSource) anonymousClass1.L$0;
                b.b(conversations2);
            }
            if (i10 != 0) {
                conversations = q.o0(inboxPagingSource2.intercomDataLayer.getConversations().getValue());
            } else {
                conversations = conversationList.getConversations();
            }
            i.b(conversations);
            if (conversationList.hasMorePages() || (conversation = (Conversation) q.W(conversations)) == null) {
                l10 = null;
            } else {
                l10 = new Long(ConversationExtensionsKt.lastActionCreatedAt(conversation));
            }
            return new PagingSource.b.C0195b(conversations, null, l10);
        }
        b.b(conversations2);
        InboxRepository inboxRepository = this.inboxRepository;
        Long lA = aVar.a();
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = aVar;
        anonymousClass1.label = 1;
        conversations2 = inboxRepository.getConversations(lA, 20, anonymousClass1);
        if (conversations2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        inboxPagingSource = this;
        NetworkResponse networkResponse = (NetworkResponse) conversations2;
        if (!(networkResponse instanceof NetworkResponse.Success)) {
            if (networkResponse instanceof NetworkResponse.NetworkError) {
                aVar2 = new PagingSource.b.a(((NetworkResponse.NetworkError) networkResponse).getError());
            } else if (networkResponse instanceof NetworkResponse.ClientError) {
                aVar2 = new PagingSource.b.a(((NetworkResponse.ClientError) networkResponse).getError());
            } else {
                if (!(networkResponse instanceof NetworkResponse.ServerError)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2 = new PagingSource.b.a(new Error("Server error : code " + ((NetworkResponse.ServerError) networkResponse).getCode()));
            }
            return aVar2;
        }
        int i13 = aVar.a() != null ? 0 : 1;
        ConversationsResponse conversationsResponseBuild = ((ConversationsResponse.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
        ConversationList conversationPage = conversationsResponseBuild.getConversationPage();
        IntercomDataLayer intercomDataLayer = inboxPagingSource.intercomDataLayer;
        Config config = conversationsResponseBuild.getConfig();
        i.d(config, "getConfig(...)");
        intercomDataLayer.updateConfig(config);
        IntercomDataLayer intercomDataLayer2 = inboxPagingSource.intercomDataLayer;
        List<Conversation> conversations3 = conversationPage.getConversations();
        i.d(conversations3, "getConversations(...)");
        intercomDataLayer2.addConversations(conversations3);
        p<EmptyState, c<? super r>, Object> pVar = inboxPagingSource.onEmptyState;
        EmptyState emptyState = conversationPage.getEmptyState();
        i.d(emptyState, "getEmptyState(...)");
        anonymousClass1.L$0 = inboxPagingSource;
        anonymousClass1.L$1 = conversationPage;
        anonymousClass1.I$0 = i13;
        anonymousClass1.label = 2;
        if (pVar.invoke(emptyState, anonymousClass1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        conversationList = conversationPage;
        inboxPagingSource2 = inboxPagingSource;
        i10 = i13;
        if (i10 != 0) {
            conversations = q.o0(inboxPagingSource2.intercomDataLayer.getConversations().getValue());
        } else {
            conversations = conversationList.getConversations();
        }
        i.b(conversations);
        if (conversationList.hasMorePages()) {
            l10 = null;
        } else {
            l10 = null;
        }
        return new PagingSource.b.C0195b(conversations, null, l10);
    }
}
