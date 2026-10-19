package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.InterfaceC2694i0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22083b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f22084c = BrazeLogger.getBrazeLogTag((Class<?>) w0.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC2694i0 f22085a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String a(String str, String str2) {
            String strSubstring = str.substring(str2.length());
            kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
    }

    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f22086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f22087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f22088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f22089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f22090f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f22091g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f22092h;
        int j;

        public b(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f22092h = obj;
            this.j |= Integer.MIN_VALUE;
            return w0.this.a(null, null, null, this);
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f22094b = new c();

        public c() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Waiting to consume new line";
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22095b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f22095b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return B7.b.g(new StringBuilder("Received new line: '"), this.f22095b, '\'');
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f22096b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ref$ObjectRef ref$ObjectRef) {
            super(0);
            this.f22096b = ref$ObjectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Recorded event type: " + ((String) this.f22096b.element);
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f22097b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Ref$ObjectRef ref$ObjectRef) {
            super(0);
            this.f22097b = ref$ObjectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Recorded data type: " + ((String) this.f22097b.element);
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f22098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f22099c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(0);
            this.f22098b = ref$ObjectRef;
            this.f22099c = ref$ObjectRef2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Handling full event on blank line. lastEventType: '");
            sb2.append((String) this.f22098b.element);
            sb2.append("' \ndata: '");
            return B7.b.g(sb2, (String) this.f22099c.element, '\'');
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22100b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.f22100b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Got un-actionable stream line:\n" + this.f22100b;
        }
    }

    public static final class i extends Lambda implements Ia.a {
        public i() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Got call to endStream(). Stream job: " + w0.this.f22085a;
        }
    }

    public static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f22102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f22103c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22105e;

        public j(kotlin.coroutines.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f22103c = obj;
            this.f22105e |= Integer.MIN_VALUE;
            return w0.this.a(this);
        }
    }

    public static final class k extends Lambda implements Ia.a {
        public k() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Got call to endStreamAndJoin(). Stream job: " + w0.this.f22085a;
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22108c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, String str2) {
            super(0);
            this.f22107b = str;
            this.f22108c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Got event '");
            sb2.append(this.f22107b);
            sb2.append("' and data: '");
            return B7.b.g(sb2, this.f22108c, '\'');
        }
    }

    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f22109b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(JSONObject jSONObject) {
            super(0);
            this.f22109b = jSONObject;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Parsed dust message json to:\n" + JsonUtils.getPrettyPrintedString(this.f22109b);
        }
    }

    public static final class n extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22110b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(0);
            this.f22110b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to parse data line:\n" + this.f22110b;
        }
    }

    public static final class o extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22112c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, String str2) {
            super(0);
            this.f22111b = str;
            this.f22112c = str2;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Not handling event: '");
            sb2.append(this.f22111b);
            sb2.append("' and data: '");
            return B7.b.g(sb2, this.f22112c, '\'');
        }
    }

    public static final class p extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f22113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f22114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ BufferedReader f22115d;

        public static final class a extends SuspendLambda implements Ia.p {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f22116b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f22117c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ BufferedReader f22118d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.n f22119e;

            /* JADX INFO: renamed from: bo.app.w0$p$a$a, reason: collision with other inner class name */
            public static final class C0232a extends Lambda implements Ia.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final C0232a f22120b = new C0232a();

                public C0232a() {
                    super(0);
                }

                @Override // Ia.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Caught unexpected exception in stream producer";
                }
            }

            public static final class b extends Lambda implements Ia.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Exception f22121b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Exception exc) {
                    super(0);
                    this.f22121b = exc;
                }

                @Override // Ia.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Stream producer job cancelled " + this.f22121b;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BufferedReader bufferedReader, kotlinx.coroutines.channels.n nVar, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f22118d = bufferedReader;
                this.f22119e = nVar;
            }

            @Override // Ia.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
                return ((a) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                a aVar = new a(this.f22118d, this.f22119e, cVar);
                aVar.f22117c = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x0045  */
            /* JADX WARN: Code duplicated, block: B:26:0x0053  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.A a10;
                Exception e10;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                int i10 = this.f22116b;
                if (i10 == 0) {
                    kotlin.b.b(obj);
                    kotlinx.coroutines.A a11 = (kotlinx.coroutines.A) this.f22117c;
                    try {
                        String line = this.f22118d.readLine();
                        if (line == null) {
                            return p293xa.r.f47939a;
                        }
                        kotlinx.coroutines.channels.n nVar = this.f22119e;
                        this.f22117c = a11;
                        this.f22116b = 1;
                        if (nVar.t(line, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Exception e11) {
                        a10 = a11;
                        e10 = e11;
                        if (kotlinx.coroutines.B.e(a10)) {
                            BrazeLogger.INSTANCE.brazelog(w0.f22084c, BrazeLogger.Priority.E, (Throwable) e10, (Ia.a<String>) C0232a.f22120b);
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new b(e10), 6, (Object) null);
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a10 = (kotlinx.coroutines.A) this.f22117c;
                    try {
                        kotlin.b.b(obj);
                    } catch (Exception e12) {
                        e10 = e12;
                        if (kotlinx.coroutines.B.e(a10)) {
                            BrazeLogger.INSTANCE.brazelog(w0.f22084c, BrazeLogger.Priority.E, (Throwable) e10, (Ia.a<String>) C0232a.f22120b);
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new b(e10), 6, (Object) null);
                        }
                    }
                }
                return p293xa.r.f47939a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(BufferedReader bufferedReader, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f22115d = bufferedReader;
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.channels.n nVar, kotlin.coroutines.c cVar) {
            return ((p) create(nVar, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            p pVar = new p(this.f22115d, cVar);
            pVar.f22114c = obj;
            return pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlinx.coroutines.channels.n nVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.f22113b;
            if (i10 == 0) {
                kotlin.b.b(obj);
                nVar = (kotlinx.coroutines.channels.n) this.f22114c;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar = (kotlinx.coroutines.channels.n) this.f22114c;
                kotlin.b.b(obj);
            }
            while (kotlinx.coroutines.B.e(nVar)) {
                Sa.a aVar = kotlinx.coroutines.N.f43200c;
                a aVar2 = new a(this.f22115d, nVar, null);
                this.f22114c = nVar;
                this.f22113b = 1;
                if (C2680e.f(aVar, aVar2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return p293xa.r.f47939a;
        }
    }

    public static final class q extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22122b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str) {
            super(0);
            this.f22122b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Got call to startStream() for url " + this.f22122b;
        }
    }

    public static final class r extends Lambda implements Ia.a {
        public r() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not restarting stream since " + w0.this.f22085a + " is still active.";
        }
    }

    public static final class s extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f22124b;

        public s(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
            return ((s) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return w0.this.new s(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.f22124b;
            if (i10 == 0) {
                kotlin.b.b(obj);
                w0 w0Var = w0.this;
                this.f22124b = 1;
                if (w0Var.a(this) == coroutineSingletons) {
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

    public static final class t extends SuspendLambda implements Ia.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f22126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f22127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f22128d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f22129e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ia.l f22131g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f22132h;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f22133b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.f22133b = str;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Starting DUST stream to " + this.f22133b;
            }
        }

        public static final class b extends SuspendLambda implements Ia.p {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f22134b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f22135c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, kotlin.coroutines.c cVar) {
                super(2, cVar);
                this.f22135c = str;
            }

            @Override // Ia.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
                return ((b) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
                return new b(this.f22135c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws IOException {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.f22134b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f22135c).openConnection());
                uRLConnection.setRequestProperty("Accept", "text/event-stream");
                uRLConnection.setDoInput(true);
                uRLConnection.connect();
                return uRLConnection;
            }
        }

        public static final class c extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ref$ObjectRef f22136b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Ref$ObjectRef ref$ObjectRef) {
                super(0);
                this.f22136b = ref$ObjectRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "DUST stream response code " + ((HttpURLConnection) this.f22136b.element).getResponseCode();
            }
        }

        public static final class d extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f22137b = new d();

            public d() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Stream job coroutine no longer active";
            }
        }

        public static final class e extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f22138b = new e();

            public e() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Caught unexpected exception listening to DUST stream";
            }
        }

        public static final class f extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f22139b = new f();

            public f() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Stream connection job cancelled";
            }
        }

        public static final class g extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final g f22140b = new g();

            public g() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Closing stream connection data";
            }
        }

        public static final class h extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final h f22141b = new h();

            public h() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Stream job finished";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Ia.l lVar, String str, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f22131g = lVar;
            this.f22132h = str;
        }

        @Override // Ia.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c cVar) {
            return ((t) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            t tVar = w0.this.new t(this.f22131g, this.f22132h, cVar);
            tVar.f22129e = obj;
            return tVar;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00ce A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:45:0x0109 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:7:0x0019, B:29:0x00d0, B:43:0x0103, B:45:0x0109, B:46:0x0117, B:21:0x0066), top: B:56:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x0117 A[Catch: all -> 0x0100, TRY_LEAVE, TryCatch #0 {all -> 0x0100, blocks: (B:7:0x0019, B:29:0x00d0, B:43:0x0103, B:45:0x0109, B:46:0x0117, B:21:0x0066), top: B:56:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x013f A[PHI: r0
          0x013f: PHI (r0v11 java.net.HttpURLConnection) = (r0v9 java.net.HttpURLConnection), (r0v15 java.net.HttpURLConnection) binds: [B:48:0x013d, B:31:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:54:0x0169  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r5v6, types: [T, java.net.HttpURLConnection] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            HttpURLConnection httpURLConnection;
            kotlinx.coroutines.A a10;
            Ref$ObjectRef ref$ObjectRef;
            Object objF;
            kotlinx.coroutines.A a11;
            Ref$ObjectRef ref$ObjectRef2;
            kotlinx.coroutines.channels.p pVarA;
            w0 w0Var;
            Ia.l lVar;
            kotlinx.coroutines.A a12;
            HttpURLConnection httpURLConnection2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            Ref$ObjectRef ref$ObjectRef3 = this.f22128d;
            try {
                if (ref$ObjectRef3 == 0) {
                    kotlin.b.b(obj);
                    a10 = (kotlinx.coroutines.A) this.f22129e;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new a(this.f22132h), 6, (Object) null);
                    ref$ObjectRef = new Ref$ObjectRef();
                    try {
                        Sa.a aVar = kotlinx.coroutines.N.f43200c;
                        b bVar = new b(this.f22132h, null);
                        this.f22129e = a10;
                        this.f22126b = ref$ObjectRef;
                        this.f22127c = ref$ObjectRef;
                        this.f22128d = 1;
                        objF = C2680e.f(aVar, bVar, this);
                        if (objF == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        a11 = a10;
                        ref$ObjectRef2 = ref$ObjectRef;
                        kotlin.jvm.internal.i.c(objF, "null cannot be cast to non-null type java.net.HttpURLConnection");
                        ref$ObjectRef2.element = (HttpURLConnection) objF;
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new c(ref$ObjectRef), 6, (Object) null);
                        w0 w0Var2 = w0.this;
                        InputStream inputStream = ((HttpURLConnection) ref$ObjectRef.element).getInputStream();
                        kotlin.jvm.internal.i.d(inputStream, "conn.inputStream");
                        pVarA = w0Var2.a(a11, new BufferedReader(new InputStreamReader(inputStream, kotlin.text.a.f43120b), 8192));
                        w0Var = w0.this;
                        lVar = this.f22131g;
                        this.f22129e = a11;
                        this.f22126b = ref$ObjectRef;
                        this.f22127c = null;
                        this.f22128d = 2;
                        if (w0Var.a(a11, pVarA, lVar, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        a12 = a11;
                        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                        BrazeLogger.brazelog$default(brazeLogger, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) d.f22137b, 6, (Object) null);
                        BrazeLogger.brazelog$default(brazeLogger, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) g.f22140b, 6, (Object) null);
                        httpURLConnection2 = (HttpURLConnection) ref$ObjectRef.element;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                    } catch (Exception e10) {
                        e = e10;
                        if (kotlinx.coroutines.B.e(a10)) {
                            BrazeLogger.INSTANCE.brazelog(w0.f22084c, BrazeLogger.Priority.E, (Throwable) e, (Ia.a<String>) e.f22138b);
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) f.f22139b, 6, (Object) null);
                        }
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) g.f22140b, 6, (Object) null);
                        httpURLConnection2 = (HttpURLConnection) ref$ObjectRef.element;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) h.f22141b, 6, (Object) null);
                        return p293xa.r.f47939a;
                    }
                } else if (ref$ObjectRef3 == 1) {
                    Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) this.f22127c;
                    Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) this.f22126b;
                    a10 = (kotlinx.coroutines.A) this.f22129e;
                    try {
                        kotlin.b.b(obj);
                        a11 = a10;
                        ref$ObjectRef2 = ref$ObjectRef4;
                        ref$ObjectRef = ref$ObjectRef5;
                        objF = obj;
                        try {
                            kotlin.jvm.internal.i.c(objF, "null cannot be cast to non-null type java.net.HttpURLConnection");
                            ref$ObjectRef2.element = (HttpURLConnection) objF;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new c(ref$ObjectRef), 6, (Object) null);
                            w0 w0Var3 = w0.this;
                            InputStream inputStream2 = ((HttpURLConnection) ref$ObjectRef.element).getInputStream();
                            kotlin.jvm.internal.i.d(inputStream2, "conn.inputStream");
                            pVarA = w0Var3.a(a11, new BufferedReader(new InputStreamReader(inputStream2, kotlin.text.a.f43120b), 8192));
                            w0Var = w0.this;
                            lVar = this.f22131g;
                            this.f22129e = a11;
                            this.f22126b = ref$ObjectRef;
                            this.f22127c = null;
                            this.f22128d = 2;
                            if (w0Var.a(a11, pVarA, lVar, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            a12 = a11;
                            BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                            BrazeLogger.brazelog$default(brazeLogger2, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) d.f22137b, 6, (Object) null);
                            BrazeLogger.brazelog$default(brazeLogger2, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) g.f22140b, 6, (Object) null);
                            httpURLConnection2 = (HttpURLConnection) ref$ObjectRef.element;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                        } catch (Exception e11) {
                            e = e11;
                            a10 = a11;
                            if (kotlinx.coroutines.B.e(a10)) {
                                BrazeLogger.INSTANCE.brazelog(w0.f22084c, BrazeLogger.Priority.E, (Throwable) e, (Ia.a<String>) e.f22138b);
                            } else {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) f.f22139b, 6, (Object) null);
                            }
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) g.f22140b, 6, (Object) null);
                            httpURLConnection2 = (HttpURLConnection) ref$ObjectRef.element;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                        } catch (Throwable th) {
                            th = th;
                            ref$ObjectRef5 = ref$ObjectRef;
                            ref$ObjectRef3 = ref$ObjectRef5;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) g.f22140b, 6, (Object) null);
                            httpURLConnection = (HttpURLConnection) ref$ObjectRef3.element;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        ref$ObjectRef = ref$ObjectRef5;
                        if (kotlinx.coroutines.B.e(a10)) {
                            BrazeLogger.INSTANCE.brazelog(w0.f22084c, BrazeLogger.Priority.E, (Throwable) e, (Ia.a<String>) e.f22138b);
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) f.f22139b, 6, (Object) null);
                        }
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) g.f22140b, 6, (Object) null);
                        httpURLConnection2 = (HttpURLConnection) ref$ObjectRef.element;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) h.f22141b, 6, (Object) null);
                        return p293xa.r.f47939a;
                    } catch (Throwable th2) {
                        th = th2;
                        ref$ObjectRef3 = ref$ObjectRef5;
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) g.f22140b, 6, (Object) null);
                        httpURLConnection = (HttpURLConnection) ref$ObjectRef3.element;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } else {
                    if (ref$ObjectRef3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) this.f22126b;
                    a12 = (kotlinx.coroutines.A) this.f22129e;
                    try {
                        kotlin.b.b(obj);
                        BrazeLogger brazeLogger3 = BrazeLogger.INSTANCE;
                        BrazeLogger.brazelog$default(brazeLogger3, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) d.f22137b, 6, (Object) null);
                        BrazeLogger.brazelog$default(brazeLogger3, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) g.f22140b, 6, (Object) null);
                        httpURLConnection2 = (HttpURLConnection) ref$ObjectRef.element;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                    } catch (Exception e13) {
                        e = e13;
                        a10 = a12;
                        if (kotlinx.coroutines.B.e(a10)) {
                            BrazeLogger.INSTANCE.brazelog(w0.f22084c, BrazeLogger.Priority.E, (Throwable) e, (Ia.a<String>) e.f22138b);
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) f.f22139b, 6, (Object) null);
                        }
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) g.f22140b, 6, (Object) null);
                        httpURLConnection2 = (HttpURLConnection) ref$ObjectRef.element;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0.f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) h.f22141b, 6, (Object) null);
                return p293xa.r.f47939a;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static final class u extends Lambda implements Ia.a {
        public u() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Started stream job " + w0.this.f22085a;
        }
    }

    public final void b() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new i(), 3, (Object) null);
        InterfaceC2694i0 interfaceC2694i0 = this.f22085a;
        if (interfaceC2694i0 != null) {
            interfaceC2694i0.i(null);
        }
        this.f22085a = null;
    }

    public final void a(String url, Ia.l ingestor, boolean z10) {
        kotlin.jvm.internal.i.e(url, "url");
        kotlin.jvm.internal.i.e(ingestor, "ingestor");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new q(url), 3, (Object) null);
        if (!z10 || this.f22085a == null) {
            C2680e.d(EmptyCoroutineContext.f43032b, new s(null));
            this.f22085a = C2680e.c(BrazeCoroutineScope.INSTANCE, null, null, new t(ingestor, url, null), 3);
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new u(), 3, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new r(), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x007b  */
    /* JADX WARN: Code duplicated, block: B:19:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:27:0x0124  */
    /* JADX WARN: Code duplicated, block: B:29:0x012a  */
    /* JADX WARN: Code duplicated, block: B:30:0x014e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a0 -> B:21:0x00a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(kotlinx.coroutines.A r25, kotlinx.coroutines.channels.p r26, Ia.l r27, kotlin.coroutines.c r28) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.w0.a(kotlinx.coroutines.A, kotlinx.coroutines.channels.p, Ia.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.channels.p a(kotlinx.coroutines.A a10, BufferedReader bufferedReader) {
        return kotlinx.coroutines.channels.l.b(a10, 0, new p(bufferedReader, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x006d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(kotlin.coroutines.c cVar) {
        j jVar;
        w0 w0Var;
        w0 w0Var2;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i10 = jVar.f22105e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f22105e = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(cVar);
            }
        } else {
            jVar = new j(cVar);
        }
        Object obj = jVar.f22103c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = jVar.f22105e;
        if (i11 == 0) {
            kotlin.b.b(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f22084c, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new k(), 6, (Object) null);
            InterfaceC2694i0 interfaceC2694i0 = this.f22085a;
            if (interfaceC2694i0 != null) {
                jVar.f22102b = this;
                jVar.f22105e = 1;
                if (C2702l0.c(interfaceC2694i0, jVar) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                w0Var2 = this;
                jVar.f22102b = w0Var2;
                jVar.f22105e = 2;
                if (kotlinx.coroutines.I.b(50L, jVar) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                w0Var = w0Var2;
            } else {
                w0Var = this;
            }
        } else if (i11 == 1) {
            w0Var2 = (w0) jVar.f22102b;
            kotlin.b.b(obj);
            jVar.f22102b = w0Var2;
            jVar.f22105e = 2;
            if (kotlinx.coroutines.I.b(50L, jVar) == coroutineSingletons) {
                return coroutineSingletons;
            }
            w0Var = w0Var2;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w0Var = (w0) jVar.f22102b;
            kotlin.b.b(obj);
        }
        w0Var.f22085a = null;
        return p293xa.r.f47939a;
    }

    private final void a(String str, String str2, Ia.l lVar) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str3 = f22084c;
        BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new l(str, str2), 6, (Object) null);
        if (kotlin.jvm.internal.i.a(str, "msg")) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new m(jSONObject), 6, (Object) null);
                lVar.invoke(i2.f21298a.a(jSONObject));
                return;
            } catch (Exception e10) {
                BrazeLogger.INSTANCE.brazelog(f22084c, BrazeLogger.Priority.E, (Throwable) e10, (Ia.a<String>) new n(str2));
                return;
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, (Ia.a) new o(str, str2), 6, (Object) null);
    }
}
