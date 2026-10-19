package com.google.firebase.sessions;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: SessionLifecycleClient.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", l = {151}, m = "invokeSuspend")
final class SessionLifecycleClient$sendLifecycleEvents$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ List<Message> $messages;
    int label;
    final /* synthetic */ u this$0;

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return Cb.a.e(Long.valueOf(((Message) t8).getWhen()), Long.valueOf(((Message) t10).getWhen()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionLifecycleClient$sendLifecycleEvents$1(u uVar, List<Message> list, kotlin.coroutines.c<? super SessionLifecycleClient$sendLifecycleEvents$1> cVar) {
        super(2, cVar);
        this.this$0 = uVar;
        this.$messages = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SessionLifecycleClient$sendLifecycleEvents$1(this.this$0, this.$messages, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((SessionLifecycleClient$sendLifecycleEvents$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            com.google.firebase.sessions.api.a aVar = com.google.firebase.sessions.api.a.f28674a;
            this.label = 1;
            obj = aVar.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        Map map = (Map) obj;
        if (!map.isEmpty()) {
            Collection collectionValues = map.values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((SessionSubscriber) it.next()).a()) {
                        List<Message> listH0 = kotlin.collections.q.h0(kotlin.collections.q.M(kotlin.collections.l.t(u.a(this.this$0, this.$messages, 2), u.a(this.this$0, this.$messages, 1))), new a());
                        u uVar = this.this$0;
                        for (Message message : listH0) {
                            Messenger messenger = uVar.f28778b;
                            LinkedBlockingDeque<Message> linkedBlockingDeque = uVar.f28779c;
                            if (messenger != null) {
                                try {
                                    int i11 = message.what;
                                    messenger.send(message);
                                } catch (RemoteException unused) {
                                    int i12 = message.what;
                                    if (linkedBlockingDeque.offer(message)) {
                                        linkedBlockingDeque.size();
                                    }
                                }
                            } else if (linkedBlockingDeque.offer(message)) {
                                int i13 = message.what;
                                linkedBlockingDeque.size();
                            } else {
                                int i14 = message.what;
                            }
                        }
                        break;
                    }
                }
            }
        }
        return p293xa.r.f47939a;
    }
}
