package U4;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: U4.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0798f<T extends IInterface> extends AbstractC0794b<T> implements com.google.android.gms.common.api.a.e {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Set f6459E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Account f6460F;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC0798f(Context context, Looper looper, int i10, C0795c c0795c, com.google.android.gms.common.api.d.a aVar, com.google.android.gms.common.api.d.b bVar) {
        b0 b0VarA = AbstractC0799g.a(context);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.f25297d;
        C0804l.h(aVar);
        C0804l.h(bVar);
        super(context, looper, b0VarA, googleApiAvailability, i10, new C0814w(aVar), new C0815x(bVar), c0795c.f6429f);
        this.f6460F = c0795c.f6424a;
        Set set = c0795c.f6426c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f6459E = set;
    }

    @Override // com.google.android.gms.common.api.a.e
    public final Set<Scope> c() {
        return s() ? this.f6459E : Collections.emptySet();
    }

    @Override // U4.AbstractC0794b
    public final Account w() {
        return this.f6460F;
    }

    @Override // U4.AbstractC0794b
    public final Set<Scope> z() {
        return this.f6459E;
    }
}
