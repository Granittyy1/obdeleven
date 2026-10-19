package N6;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: JsonDataEncoderBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements M6.a<e> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final N6.a f4654e = new N6.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f4655f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f4656g = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f4657h = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f4659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N6.a f4660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4661d;

    /* JADX INFO: compiled from: JsonDataEncoderBuilder.java */
    public static final class a implements L6.e<Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SimpleDateFormat f4662a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f4662a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        @Override // L6.a
        public final void a(Object obj, L6.f fVar) throws IOException {
            fVar.f(f4662a.format((Date) obj));
        }
    }

    public e() {
        HashMap map = new HashMap();
        this.f4658a = map;
        HashMap map2 = new HashMap();
        this.f4659b = map2;
        this.f4660c = f4654e;
        this.f4661d = false;
        map2.put(String.class, f4655f);
        map.remove(String.class);
        map2.put(Boolean.class, f4656g);
        map.remove(Boolean.class);
        map2.put(Date.class, f4657h);
        map.remove(Date.class);
    }

    public final M6.a a(Class cls, L6.c cVar) {
        this.f4658a.put(cls, cVar);
        this.f4659b.remove(cls);
        return this;
    }
}
