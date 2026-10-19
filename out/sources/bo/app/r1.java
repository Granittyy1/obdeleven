package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class r1 implements e2 {

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21831b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f21831b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot create card control event for Feed card. Returning null. Card id: " + this.f21831b;
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21832b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f21832b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot create card dismissed event for Feed card. Returning null. Card id: " + this.f21832b;
        }
    }

    @Override // bo.app.e2
    public a2 a(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(cardId), 2, (Object) null);
        return null;
    }

    @Override // bo.app.e2
    public a2 b(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        return C1471i.f21202h.e(cardId);
    }

    @Override // bo.app.e2
    public a2 c(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new a(cardId), 2, (Object) null);
        return null;
    }

    @Override // bo.app.e2
    public a2 d(String cardId) {
        kotlin.jvm.internal.i.e(cardId, "cardId");
        return C1471i.f21202h.f(cardId);
    }
}
