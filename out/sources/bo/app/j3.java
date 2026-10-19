package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f21384a;

    public static final class a extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f21385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Oa.l f21386c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, Oa.l lVar) {
            super(0);
            this.f21385b = obj;
            this.f21386c = lVar;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot assign " + this.f21385b + " to only-set-once property " + this.f21386c.getName();
        }
    }

    public Object getValue(Object thisRef, Oa.l property) {
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        return this.f21384a;
    }

    public void setValue(Object thisRef, Oa.l property, Object obj) {
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        Object obj2 = this.f21384a;
        if (obj2 == null) {
            this.f21384a = obj;
        } else {
            if (obj2.equals(obj)) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a(obj, property), 3, (Object) null);
        }
    }
}
