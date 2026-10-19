package U4;

import java.util.ArrayList;

/* JADX INFO: renamed from: U4.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0803k {

    /* JADX INFO: renamed from: U4.k$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f6473a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f6474b;

        public final void a(Object obj, String str) {
            int length = str.length();
            String strValueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(length + 1 + strValueOf.length());
            sb2.append(str);
            sb2.append("=");
            sb2.append(strValueOf);
            this.f6473a.add(sb2.toString());
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f6474b.getClass().getSimpleName());
            sb2.append('{');
            ArrayList arrayList = this.f6473a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) arrayList.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
