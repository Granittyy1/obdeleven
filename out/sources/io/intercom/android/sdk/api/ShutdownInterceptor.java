package io.intercom.android.sdk.api;

import C7.g;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import okhttp3.A;
import okhttp3.B;
import okhttp3.q;
import okhttp3.r;
import okhttp3.z;
import org.json.JSONException;
import org.json.JSONObject;
import p318zb.C2839f;

/* JADX INFO: loaded from: classes3.dex */
public class ShutdownInterceptor implements q {
    private static final String ERROR = "error";
    private static final String MESSAGE = "message";
    private static final String MESSENGER_SHUTDOWN_RESPONSE = "messenger_shutdown_response";
    private static final String SHUTDOWN_PERIOD = "shutdown_period";
    private static final String TYPE = "type";
    private final ShutdownState shutdownState;
    private final Twig twig = LumberMill.getLogger();

    public ShutdownInterceptor(ShutdownState shutdownState) {
        this.shutdownState = shutdownState;
    }

    @Override // okhttp3.q
    public z intercept(q.a aVar) throws IOException {
        if (!this.shutdownState.canSendNetworkRequests()) {
            this.twig.e(this.shutdownState.getShutdownReason(), new Object[0]);
            throw new IOException(this.shutdownState.getShutdownReason());
        }
        z zVarA = aVar.a(aVar.request());
        if (!zVarA.h()) {
            A a10 = zVarA.f45686h;
            String strI = a10.i();
            z.a aVarI = zVarA.i();
            r rVarC = a10.c();
            Charset charset = kotlin.text.a.f43120b;
            if (rVarC != null) {
                Pattern pattern = r.f45588d;
                Charset charsetA = rVarC.a(null);
                if (charsetA == null) {
                    rVarC = r.a.b(rVarC + "; charset=utf-8");
                } else {
                    charset = charsetA;
                }
            }
            C2839f c2839f = new C2839f();
            i.e(charset, "charset");
            c2839f.e1(strI, 0, strI.length(), charset);
            aVarI.f45699g = new B(rVarC, c2839f.f49074c, c2839f);
            zVarA = aVarI.a();
            a10.close();
            try {
                JSONObject jSONObject = new JSONObject(strI).getJSONObject(ERROR);
                if (jSONObject.getString("type").equals(MESSENGER_SHUTDOWN_RESPONSE)) {
                    this.shutdownState.updateShutdownState(TimeUnit.SECONDS.toMillis(jSONObject.getLong(SHUTDOWN_PERIOD)), jSONObject.getString("message"));
                }
            } catch (JSONException unused) {
                Twig twig = this.twig;
                StringBuilder sbA = g.a("Failed to deserialise error response: `", strI, "` message: `");
                sbA.append(zVarA.f45682d);
                sbA.append("`");
                twig.internal(sbA.toString());
            }
        }
        return zVarA;
    }
}
