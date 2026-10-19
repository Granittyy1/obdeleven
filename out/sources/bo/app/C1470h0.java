package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: bo.app.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1470h0 extends a1 {

    /* JADX INFO: renamed from: bo.app.h0$a */
    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d2.a f21155b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d2.a aVar) {
            super(0);
            this.f21155b = aVar;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Default queue created for dest " + this.f21155b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1470h0(d2.a destination, o0 dispatchDataProvider) {
        super(destination, dispatchDataProvider);
        kotlin.jvm.internal.i.e(destination, "destination");
        kotlin.jvm.internal.i.e(dispatchDataProvider, "dispatchDataProvider");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a(destination), 3, (Object) null);
    }

    @Override // bo.app.a1
    public void a(long j) {
    }
}
