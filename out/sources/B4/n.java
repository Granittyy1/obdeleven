package B4;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: compiled from: LogResponse.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static j a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        j jVar = new j(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return jVar;
                    }
                    j jVar2 = new j(jsonReader.nextLong());
                    jsonReader.close();
                    return jVar2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public abstract long b();
}
