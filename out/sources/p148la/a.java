package p148la;

import Q3.d;
import androidx.collection.C0875c;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;

/* JADX INFO: compiled from: CompositeDisposable.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b, p196pa.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0875c f44511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f44512c;

    @Override // p196pa.a
    public final boolean a(b bVar) {
        Object obj;
        d.I(bVar, "Disposable item is null");
        if (this.f44512c) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f44512c) {
                    return false;
                }
                C0875c c0875c = this.f44511b;
                if (c0875c != null) {
                    Object[] objArr = (Object[]) c0875c.f9169e;
                    int i10 = c0875c.f9166b;
                    int iHashCode = bVar.hashCode() * (-1640531527);
                    int i11 = (iHashCode ^ (iHashCode >>> 16)) & i10;
                    Object obj2 = objArr[i11];
                    if (obj2 != null) {
                        if (obj2.equals(bVar)) {
                            c0875c.d(i11, i10, objArr);
                        } else {
                            do {
                                i11 = (i11 + 1) & i10;
                                obj = objArr[i11];
                                if (obj == null) {
                                }
                            } while (!obj.equals(bVar));
                            c0875c.d(i11, i10, objArr);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p196pa.a
    public final boolean b(b bVar) {
        if (!this.f44512c) {
            synchronized (this) {
                try {
                    if (!this.f44512c) {
                        C0875c c0875c = this.f44511b;
                        if (c0875c == null) {
                            c0875c = new C0875c(2);
                            int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            c0875c.f9166b = iNumberOfLeadingZeros - 1;
                            c0875c.f9168d = (int) (0.75f * iNumberOfLeadingZeros);
                            c0875c.f9169e = new Object[iNumberOfLeadingZeros];
                            this.f44511b = c0875c;
                        }
                        c0875c.a(bVar);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // p196pa.a
    public final boolean c(b bVar) {
        if (!a(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    @Override // p148la.b
    public final boolean d() {
        return this.f44512c;
    }

    @Override // p148la.b
    public final void dispose() {
        if (this.f44512c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f44512c) {
                    return;
                }
                this.f44512c = true;
                C0875c c0875c = this.f44511b;
                ArrayList arrayList = null;
                this.f44511b = null;
                if (c0875c == null) {
                    return;
                }
                for (Object obj : (Object[]) c0875c.f9169e) {
                    if (obj instanceof b) {
                        try {
                            ((b) obj).dispose();
                        } catch (Throwable th) {
                            Fa.d.g(th);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(th);
                        }
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new CompositeException(arrayList);
                    }
                    throw ExceptionHelper.c((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
