package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IFireOnceEventSubscriber;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2680e;

/* JADX INFO: loaded from: classes.dex */
public final class g1 implements k2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f21118h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l5 f21119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f21120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentMap f21121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentMap f21122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ReentrantLock f21123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ReentrantLock f21124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ReentrantLock f21125g;

    public static final class a {

        /* JADX INFO: renamed from: bo.app.g1$a$a, reason: collision with other inner class name */
        public static final class C0217a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Class f21126b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Set f21127c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0217a(Class cls, Set set) {
                super(0);
                this.f21126b = cls;
                this.f21127c = set;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Triggering " + this.f21126b.getName() + " on " + this.f21127c.size() + " subscribers.";
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set a(Class cls, Set set) {
            kotlin.jvm.internal.i.c(set, "null cannot be cast to non-null type kotlin.collections.Set<com.braze.events.IEventSubscriber<T of com.braze.events.EventMessenger.Companion.getCastSubscriberSet>>");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new C0217a(cls, set), 3, (Object) null);
            return set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set a(ConcurrentMap concurrentMap, Class cls, ReentrantLock reentrantLock) {
            reentrantLock.lock();
            try {
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentMap.get(cls);
                if (copyOnWriteArraySet == null) {
                    HashSet hashSet = new HashSet();
                    reentrantLock.unlock();
                    return hashSet;
                }
                HashSet hashSet2 = new HashSet(copyOnWriteArraySet);
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArraySet) {
                    if (obj instanceof IFireOnceEventSubscriber) {
                        arrayList.add(obj);
                    }
                }
                copyOnWriteArraySet.removeAll(kotlin.collections.q.s0(arrayList));
                concurrentMap.put(cls, copyOnWriteArraySet);
                reentrantLock.unlock();
                return hashSet2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f21128b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Class cls) {
            super(0);
            this.f21128b = cls;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Publishing cached event for class: " + this.f21128b;
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f21129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f21130c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Class cls, Object obj) {
            super(0);
            this.f21129b = cls;
            this.f21130c = obj;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "SDK is disabled. Not publishing event class: " + this.f21129b.getName() + " and message: " + this.f21130c;
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f21131b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Class cls) {
            super(0);
            this.f21131b = cls;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not publishing null message to event class ".concat(this.f21131b.getName());
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f21132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f21133c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Class cls, Object obj) {
            super(0);
            this.f21132b = cls;
            this.f21133c = obj;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f21132b.getName() + " fired:\n" + this.f21133c;
        }
    }

    public static final class f extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f21134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IEventSubscriber f21135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f21136d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(IEventSubscriber iEventSubscriber, Object obj, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f21135c = iEventSubscriber;
            this.f21136d = obj;
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
            return ((f) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new f(this.f21135c, this.f21136d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.f21134b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            this.f21135c.trigger(this.f21136d);
            return p293xa.r.f47939a;
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f21137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g1 f21138c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Class cls, g1 g1Var) {
            super(0);
            this.f21137b = cls;
            this.f21138c = g1Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Event was published, but no subscribers were found. But not saving event for publishing later. Event class: " + this.f21137b + ' ' + this.f21138c;
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f21139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g1 f21140c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Class cls, g1 g1Var) {
            super(0);
            this.f21139b = cls;
            this.f21140c = g1Var;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: " + this.f21139b + " this " + this.f21140c;
        }
    }

    public g1(l5 sdkEnablementProvider) {
        kotlin.jvm.internal.i.e(sdkEnablementProvider, "sdkEnablementProvider");
        this.f21119a = sdkEnablementProvider;
        this.f21120b = new ConcurrentHashMap();
        this.f21121c = new ConcurrentHashMap();
        this.f21122d = new ConcurrentHashMap();
        this.f21123e = new ReentrantLock();
        this.f21124f = new ReentrantLock();
        this.f21125g = new ReentrantLock();
    }

    @Override // bo.app.k2
    public void a(Class eventClass, IEventSubscriber subscriber) {
        kotlin.jvm.internal.i.e(eventClass, "eventClass");
        kotlin.jvm.internal.i.e(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f21123e;
        reentrantLock.lock();
        try {
            a(subscriber, eventClass, this.f21120b);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.k2
    public boolean b(Class eventClass, IEventSubscriber subscriber) {
        kotlin.jvm.internal.i.e(eventClass, "eventClass");
        kotlin.jvm.internal.i.e(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f21124f;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f21121c.get(eventClass);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(subscriber);
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.k2
    public boolean c(Class eventClass, IEventSubscriber subscriber) {
        kotlin.jvm.internal.i.e(eventClass, "eventClass");
        kotlin.jvm.internal.i.e(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f21124f;
        reentrantLock.lock();
        try {
            return a(subscriber, eventClass, this.f21121c);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.k2
    public boolean d(Class eventClass, IEventSubscriber subscriber) {
        kotlin.jvm.internal.i.e(eventClass, "eventClass");
        kotlin.jvm.internal.i.e(subscriber, "subscriber");
        ReentrantLock reentrantLock = this.f21123e;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f21120b.get(eventClass);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(subscriber);
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.k2
    public void a(Object obj, Class eventClass) {
        kotlin.jvm.internal.i.e(eventClass, "eventClass");
        if (this.f21119a.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(eventClass, obj), 3, (Object) null);
            return;
        }
        if (obj == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(eventClass), 3, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(eventClass, obj), 3, (Object) null);
        a aVar = f21118h;
        Set setA = aVar.a(this.f21120b, eventClass, this.f21123e);
        Iterator it = aVar.a(eventClass, setA).iterator();
        while (it.hasNext()) {
            C2680e.c(BrazeCoroutineScope.INSTANCE, null, null, new f((IEventSubscriber) it.next(), obj, null), 3);
        }
        a aVar2 = f21118h;
        Set setA2 = aVar2.a(this.f21121c, eventClass, this.f21124f);
        Iterator it2 = aVar2.a(eventClass, setA2).iterator();
        while (it2.hasNext()) {
            ((IEventSubscriber) it2.next()).trigger(obj);
        }
        if (setA2.isEmpty() && setA.isEmpty()) {
            if (eventClass.equals(NoMatchingTriggerEvent.class)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new g(eventClass, this), 2, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new h(eventClass, this), 2, (Object) null);
            ReentrantLock reentrantLock = this.f21125g;
            reentrantLock.lock();
            try {
                this.f21122d.put(eventClass, obj);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public void b() {
        ReentrantLock reentrantLock = this.f21123e;
        reentrantLock.lock();
        try {
            this.f21120b.clear();
            p293xa.r rVar = p293xa.r.f47939a;
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = this.f21124f;
            reentrantLock2.lock();
            try {
                this.f21121c.clear();
            } finally {
                reentrantLock2.unlock();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // bo.app.k2
    public void a() {
        ReentrantLock reentrantLock = this.f21125g;
        reentrantLock.lock();
        try {
            this.f21122d.remove(ContentCardsUpdatedEvent.class);
        } finally {
            reentrantLock.unlock();
        }
    }

    private final boolean a(IEventSubscriber iEventSubscriber, Class cls, ConcurrentMap concurrentMap) {
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentMap.get(cls);
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = new CopyOnWriteArraySet();
            CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentMap.putIfAbsent(cls, copyOnWriteArraySet);
            if (copyOnWriteArraySet2 != null) {
                copyOnWriteArraySet = copyOnWriteArraySet2;
            }
        }
        boolean zAdd = copyOnWriteArraySet.add(iEventSubscriber);
        a(cls);
        return zAdd;
    }

    private final void a(Class cls) {
        ReentrantLock reentrantLock = this.f21125g;
        reentrantLock.lock();
        try {
            if (this.f21122d.containsKey(cls)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(cls), 2, (Object) null);
                Object objRemove = this.f21122d.remove(cls);
                if (objRemove != null) {
                    a(objRemove, cls);
                }
            }
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
