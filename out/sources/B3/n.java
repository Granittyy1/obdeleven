package B3;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: StreamAssetPathFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public final class n extends b<InputStream> {
    @Override // B3.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // B3.b
    public final void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // B3.b
    public final InputStream d(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
