package p220r9;

import android.content.Context;
import com.parse.ParseException;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.exceptions.HttpException;
import com.voltasit.sharednetwork.domain.common.CloudException;
import p279w9.d;

/* JADX INFO: compiled from: ParseUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class J extends d {
    public static int f(Throwable th) {
        if (th instanceof ParseException) {
            return h(((ParseException) th).getCode());
        }
        if (th instanceof CloudException.UnknownCloudException) {
            return h(((CloudException.UnknownCloudException) th).a());
        }
        return th instanceof HttpException.Unknown ? h(((HttpException.Unknown) th).a()) : R.string.common_check_network_try_again;
    }

    public static String g(Context context, Exception exc) {
        return context.getString(i(exc));
    }

    public static int h(int i10) {
        if (i10 == 100) {
            return R.string.common_check_network_try_again;
        }
        if (i10 == 202) {
            return R.string.common_email_taken;
        }
        if (i10 != 208) {
            return i10 != 403 ? R.string.common_something_went_wrong : R.string.common_account_banned;
        }
        return R.string.common_account_exists;
    }

    public static int i(Exception exc) {
        return exc instanceof ParseException ? h(((ParseException) exc).getCode()) : R.string.snackbar_unknown_exception;
    }
}
