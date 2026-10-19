package G8;

import java.util.List;

/* JADX INFO: compiled from: SubscriptionProduct.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f3573c;

    /* JADX INFO: compiled from: SubscriptionProduct.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<String> f3576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f3577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f3578e;

        public a(String titleId, String subtitleId, String subscriptionDurationId, String actionId, List bulletPointIds) {
            kotlin.jvm.internal.i.e(titleId, "titleId");
            kotlin.jvm.internal.i.e(subtitleId, "subtitleId");
            kotlin.jvm.internal.i.e(bulletPointIds, "bulletPointIds");
            kotlin.jvm.internal.i.e(subscriptionDurationId, "subscriptionDurationId");
            kotlin.jvm.internal.i.e(actionId, "actionId");
            this.f3574a = titleId;
            this.f3575b = subtitleId;
            this.f3576c = bulletPointIds;
            this.f3577d = subscriptionDurationId;
            this.f3578e = actionId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.i.a(this.f3574a, aVar.f3574a) && kotlin.jvm.internal.i.a(this.f3575b, aVar.f3575b) && kotlin.jvm.internal.i.a(this.f3576c, aVar.f3576c) && kotlin.jvm.internal.i.a(this.f3577d, aVar.f3577d) && kotlin.jvm.internal.i.a(this.f3578e, aVar.f3578e);
        }

        public final int hashCode() {
            return this.f3578e.hashCode() + B1.a.b(this.f3577d, p005a4.p.d(B1.a.b(this.f3575b, this.f3574a.hashCode() * 31, 31), 31, this.f3576c), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TranslationIds(titleId=");
            sb2.append(this.f3574a);
            sb2.append(", subtitleId=");
            sb2.append(this.f3575b);
            sb2.append(", bulletPointIds=");
            sb2.append(this.f3576c);
            sb2.append(", subscriptionDurationId=");
            sb2.append(this.f3577d);
            sb2.append(", actionId=");
            return Q8.d.a(sb2, this.f3578e, ")");
        }
    }

    public z(String title, String productId, a aVar) {
        kotlin.jvm.internal.i.e(title, "title");
        kotlin.jvm.internal.i.e(productId, "productId");
        this.f3571a = title;
        this.f3572b = productId;
        this.f3573c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.i.a(this.f3571a, zVar.f3571a) && kotlin.jvm.internal.i.a(this.f3572b, zVar.f3572b) && kotlin.jvm.internal.i.a(this.f3573c, zVar.f3573c);
    }

    public final int hashCode() {
        return this.f3573c.hashCode() + B1.a.b(this.f3572b, this.f3571a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SubscriptionProduct(title=" + this.f3571a + ", productId=" + this.f3572b + ", translationIds=" + this.f3573c + ")";
    }
}
