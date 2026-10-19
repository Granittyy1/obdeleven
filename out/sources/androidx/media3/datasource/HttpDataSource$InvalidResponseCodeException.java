package androidx.media3.datasource;

import J4.i;
import java.util.List;
import java.util.Map;
import p140l1.e;

/* JADX INFO: loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final Map<String, List<String>> headerFields;
    public final byte[] responseBody;
    public final int responseCode;
    public final String responseMessage;

    public HttpDataSource$InvalidResponseCodeException(int i10, String str, DataSourceException dataSourceException, Map map, e eVar, byte[] bArr) {
        super(i.b(i10, "Response code: "), dataSourceException, eVar, 2004);
        this.responseCode = i10;
        this.responseMessage = str;
        this.headerFields = map;
        this.responseBody = bArr;
    }
}
