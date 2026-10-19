package p279w9;

import com.braze.Constants;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.Parse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ParseUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: compiled from: ParseUtils.java */
    public static class a<T extends ParseObject> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParseException f47830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<T> f47831b;

        public a() {
            throw null;
        }

        public a(List list, ParseException parseException) {
            this.f47831b = list;
            this.f47830a = parseException;
        }
    }

    /* JADX INFO: compiled from: ParseUtils.java */
    public interface b<T extends ParseObject> {
        void g(List<T> list, ParseException parseException);
    }

    public static <T extends ParseObject> Task<List<T>> a(final ParseQuery<T> parseQuery, final p279w9.a aVar, b<T> bVar) {
        final boolean zA = Parse.a();
        List<T> list = (List) Parse.f34395b.i().f(aVar, !zA);
        if (list == null) {
            return Task.callInBackground(new Callable() { // from class: w9.c
                @Override // java.util.concurrent.Callable
                public final Object call() throws ParseException {
                    ParseQuery parseQuery2 = parseQuery;
                    a aVar2 = aVar;
                    boolean z10 = zA;
                    List listB = d.b(parseQuery2, aVar2, z10);
                    if (!listB.isEmpty()) {
                        return listB;
                    }
                    d.a aVarC = d.c(parseQuery2, aVar2, z10);
                    ParseException parseException = aVarC.f47830a;
                    if (parseException == null) {
                        return aVarC.f47831b;
                    }
                    throw parseException;
                }
            }).continueWith(new com.voltasit.obdeleven.presentation.settings.b(4, bVar), Task.UI_THREAD_EXECUTOR);
        }
        if (bVar != null) {
            bVar.g(list, null);
        }
        return Task.forResult(list);
    }

    public static <T extends ParseObject> List<T> b(ParseQuery<T> parseQuery, p279w9.a aVar, boolean z10) {
        p279w9.b bVarI = Parse.f34395b.i();
        boolean z11 = aVar == null || bVarI.g(aVar);
        if ((!z10 && aVar != null) || !z11) {
            parseQuery.setCachePolicy(ParseQuery.CachePolicy.CACHE_ONLY);
            try {
                List<T> listFind = parseQuery.find();
                if (!listFind.isEmpty()) {
                    if (!z10 && aVar != null) {
                        bVarI.h(aVar, listFind);
                    }
                    return listFind;
                }
            } catch (ParseException unused) {
                return new ArrayList();
            }
        }
        return new ArrayList();
    }

    public static <T extends ParseObject> a<T> c(ParseQuery<T> parseQuery, p279w9.a aVar, boolean z10) {
        if (!z10) {
            return new a<>(new ArrayList(), new ParseException(100, "No network connection"));
        }
        p279w9.b bVarI = Parse.f34395b.i();
        try {
            parseQuery.setCachePolicy(ParseQuery.CachePolicy.NETWORK_ONLY);
            List<T> listE = (parseQuery.getSkip() == 0 && parseQuery.getLimit() == -1) ? e(parseQuery) : parseQuery.find();
            if (aVar != null) {
                bVarI.h(aVar, listE);
            }
            return new a<>(listE, null);
        } catch (ParseException e10) {
            return new a<>(new ArrayList(), e10);
        }
    }

    public static <T extends ParseObject> a<T> d(ParseQuery<T> parseQuery, p279w9.a aVar) {
        p279w9.b bVarI = Parse.f34395b.i();
        boolean zA = Parse.a();
        if (((List) bVarI.f(aVar, !zA)) != null) {
            return new a<>((List) bVarI.e(aVar), null);
        }
        List listB = b(parseQuery, aVar, zA);
        return listB.isEmpty() ? c(parseQuery, aVar, zA) : new a<>(listB, null);
    }

    public static ArrayList e(ParseQuery parseQuery) throws ParseException {
        parseQuery.setLimit(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            List listFind = parseQuery.find();
            if (listFind == null || listFind.isEmpty()) {
                break;
            }
            i10 += Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
            arrayList.addAll(listFind);
            parseQuery.setSkip(i10);
        }
        return arrayList;
    }
}
