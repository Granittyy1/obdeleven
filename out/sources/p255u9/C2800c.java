package p255u9;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: u9.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ChartDB.java */
/* JADX INFO: loaded from: classes3.dex */
@ParseClassName("Chart")
public final class C2800c extends ParseObject {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f47462b = 0;

    /* JADX INFO: renamed from: u9.c$a */
    /* JADX INFO: compiled from: ChartDB.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @I7.b("_x")
        private List<String> f47463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @I7.b("_y")
        private List<b> f47464b;

        public final List<String> a() {
            return this.f47463a;
        }

        public final List<b> b() {
            return this.f47464b;
        }

        public final void c(String str) {
            if (this.f47463a == null) {
                this.f47463a = new ArrayList();
            }
            this.f47463a.add(str);
        }

        public final void d(b bVar) {
            if (this.f47464b == null) {
                this.f47464b = new ArrayList();
            }
            this.f47464b.add(bVar);
        }
    }

    /* JADX INFO: renamed from: u9.c$b */
    /* JADX INFO: compiled from: ChartDB.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @I7.b("label")
        private String f47465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @I7.b("unit")
        private String f47466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @I7.b("color")
        private int f47467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @I7.b("values")
        private List<Float> f47468d;

        public b(String str, String str2, int i10, ArrayList arrayList) {
            this.f47465a = str;
            this.f47466b = str2;
            this.f47467c = i10;
            this.f47468d = arrayList;
        }

        public final int a() {
            return this.f47467c;
        }

        public final String b() {
            return this.f47465a;
        }

        public final String c() {
            return this.f47466b;
        }

        public final List<Float> d() {
            return this.f47468d;
        }
    }
}
