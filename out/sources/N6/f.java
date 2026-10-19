package N6;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: JsonValueObjectEncoderContext.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements L6.d, L6.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4663a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonWriter f4664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f4665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f4666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f4667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4668f;

    public f(Writer writer, HashMap map, HashMap map2, a aVar, boolean z10) {
        this.f4664b = new JsonWriter(writer);
        this.f4665c = map;
        this.f4666d = map2;
        this.f4667e = aVar;
        this.f4668f = z10;
    }

    @Override // L6.d
    public final L6.d a(L6.b bVar, Object obj) throws IOException {
        i(obj, bVar.f4467a);
        return this;
    }

    @Override // L6.d
    public final L6.d b(L6.b bVar, double d10) throws IOException {
        String str = bVar.f4467a;
        j();
        JsonWriter jsonWriter = this.f4664b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d10);
        return this;
    }

    @Override // L6.d
    public final L6.d c(L6.b bVar, int i10) throws IOException {
        String str = bVar.f4467a;
        j();
        JsonWriter jsonWriter = this.f4664b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i10);
        return this;
    }

    @Override // L6.d
    public final L6.d d(L6.b bVar, long j) throws IOException {
        String str = bVar.f4467a;
        j();
        JsonWriter jsonWriter = this.f4664b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j);
        return this;
    }

    @Override // L6.d
    public final L6.d e(L6.b bVar, boolean z10) throws IOException {
        String str = bVar.f4467a;
        j();
        JsonWriter jsonWriter = this.f4664b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z10);
        return this;
    }

    @Override // L6.f
    public final L6.f f(String str) throws IOException {
        j();
        this.f4664b.value(str);
        return this;
    }

    @Override // L6.f
    public final L6.f g(boolean z10) throws IOException {
        j();
        this.f4664b.value(z10);
        return this;
    }

    public final f h(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f4664b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i(entry.getValue(), (String) key);
                    } catch (ClassCastException e10) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            L6.c cVar = (L6.c) this.f4665c.get(obj.getClass());
            if (cVar != null) {
                jsonWriter.beginObject();
                cVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            L6.e eVar = (L6.e) this.f4666d.get(obj.getClass());
            if (eVar != null) {
                eVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f4667e.a(obj, this);
                throw null;
            }
            if (obj instanceof g) {
                int iA = ((g) obj).a();
                j();
                jsonWriter.value(iA);
            } else {
                String strName = ((Enum) obj).name();
                j();
                jsonWriter.value(strName);
            }
            return this;
        }
        if (obj instanceof byte[]) {
            j();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i10 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                jsonWriter.value(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                long j = jArr[i10];
                j();
                jsonWriter.value(j);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                jsonWriter.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                jsonWriter.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i10 < length5) {
                h(numberArr[i10]);
                i10++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i10 < length6) {
                h(objArr[i10]);
                i10++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final f i(Object obj, String str) throws IOException {
        boolean z10 = this.f4668f;
        JsonWriter jsonWriter = this.f4664b;
        if (z10) {
            if (obj != null) {
                j();
                jsonWriter.name(str);
                h(obj);
            }
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            h(obj);
        }
        return this;
    }

    public final void j() throws IOException {
        if (!this.f4663a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
