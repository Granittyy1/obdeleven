package A8;

import com.parse.ParseException;
import com.voltasit.obdeleven.domain.exceptions.AccountLockedDueToMultipleAttemptsException;
import com.voltasit.obdeleven.domain.exceptions.BluetoothException;
import com.voltasit.obdeleven.domain.exceptions.EmailAlreadyExistsException;
import com.voltasit.obdeleven.domain.exceptions.EmailAlreadyTakenException;
import com.voltasit.obdeleven.domain.exceptions.FairUsePolicyBreachException;
import com.voltasit.obdeleven.domain.exceptions.InvalidUserSessionException;
import com.voltasit.obdeleven.domain.exceptions.NoNetworkException;
import com.voltasit.obdeleven.domain.exceptions.NotEnoughCreditsException;
import com.voltasit.obdeleven.domain.exceptions.NotFoundException;
import com.voltasit.obdeleven.domain.exceptions.SfdInvalidCountryCodeException;
import com.voltasit.obdeleven.domain.exceptions.SfdRateLimitException;
import com.voltasit.obdeleven.domain.exceptions.SfdTemporarilyUnavailableException;
import com.voltasit.obdeleven.domain.exceptions.SubscriptionExpiredException;
import com.voltasit.obdeleven.domain.exceptions.TooManySessionsException;
import com.voltasit.sharednetwork.domain.common.CloudException;
import com.voltasit.sharednetwork.domain.exceptions.HttpException;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: ThrowableMapperImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements F8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.flow.v f983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.flow.v f984c;

    public w(J8.p pVar) {
        this.f982a = pVar;
        kotlinx.coroutines.flow.v vVarA = P3.d.a();
        this.f983b = vVarA;
        this.f984c = vVarA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x015a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0160  */
    /* JADX WARN: Code duplicated, block: B:106:0x0168  */
    /* JADX WARN: Code duplicated, block: B:107:0x016e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0172  */
    /* JADX WARN: Code duplicated, block: B:110:0x017f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0183  */
    /* JADX WARN: Code duplicated, block: B:115:0x0194  */
    /* JADX WARN: Code duplicated, block: B:117:0x0198  */
    /* JADX WARN: Code duplicated, block: B:118:0x019b  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:123:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:81:0x0104  */
    /* JADX WARN: Code duplicated, block: B:82:0x0110  */
    /* JADX WARN: Code duplicated, block: B:84:0x0118  */
    /* JADX WARN: Code duplicated, block: B:85:0x011c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0120  */
    /* JADX WARN: Code duplicated, block: B:89:0x012a A[ADDED_TO_REGION] */
    @Override // F8.c
    public final Throwable a(Throwable input) {
        CloudException cloudException;
        Throwable tooManySessionsException;
        int iA;
        int code;
        String message;
        kotlin.jvm.internal.i.e(input, "input");
        if (input instanceof HttpException) {
            HttpException httpException = (HttpException) input;
            int iA2 = httpException.a();
            if (iA2 == 403) {
                com.voltasit.obdeleven.domain.exceptions.HttpException.Forbidden forbidden = com.voltasit.obdeleven.domain.exceptions.HttpException.Forbidden.f30406b;
            } else if (iA2 == 404) {
                input = new NotFoundException(httpException.b());
            } else if (iA2 == 429) {
                String message2 = httpException.getMessage();
                if (message2 != null) {
                    switch (message2) {
                        case "sfd_vin_limit_for_day_reached":
                            SfdRateLimitException.Type type = SfdRateLimitException.Type.f30429d;
                            String message3 = httpException.getMessage();
                            input = new SfdRateLimitException(type, message3 != null ? message3 : "");
                            break;
                        case "sfd_day_limit_reached":
                            SfdRateLimitException.Type type2 = SfdRateLimitException.Type.f30428c;
                            String message4 = httpException.getMessage();
                            input = new SfdRateLimitException(type2, message4 != null ? message4 : "");
                            break;
                        case "sfd_one_sec_limit_reached":
                            SfdRateLimitException.Type type3 = SfdRateLimitException.Type.f30430e;
                            String message5 = httpException.getMessage();
                            input = new SfdRateLimitException(type3, message5 != null ? message5 : "");
                            break;
                        case "sfd_hour_limit_reached":
                            SfdRateLimitException.Type type4 = SfdRateLimitException.Type.f30427b;
                            String message6 = httpException.getMessage();
                            input = new SfdRateLimitException(type4, message6 != null ? message6 : "");
                            break;
                        default:
                            input = com.voltasit.obdeleven.domain.exceptions.HttpException.TooManyRequests.f30407b;
                            break;
                    }
                } else {
                    input = com.voltasit.obdeleven.domain.exceptions.HttpException.TooManyRequests.f30407b;
                }
            } else if (iA2 == 2001) {
                input = SubscriptionExpiredException.f30433b;
            } else if (iA2 == 2002) {
                input = NotEnoughCreditsException.f30413b;
            } else if (iA2 == 8820) {
                input = SfdInvalidCountryCodeException.f30426b;
            } else if (iA2 == 8821) {
                input = SfdTemporarilyUnavailableException.f30432b;
            }
            if (!(input instanceof ParseException)) {
                code = ((ParseException) input).getCode();
                if (code != 100) {
                    input = NoNetworkException.f30412b;
                } else if (code != 203) {
                    message = input.getMessage();
                    if (message == null) {
                        message = "Email taken";
                    }
                    tooManySessionsException = new EmailAlreadyTakenException(message);
                    input = tooManySessionsException;
                } else if (code != 209) {
                    input = InvalidUserSessionException.f30411b;
                } else if (input instanceof CloudException) {
                    cloudException = (CloudException) input;
                    if (cloudException instanceof CloudException.AccountLockedDueToMultipleAttemptsException) {
                        tooManySessionsException = new AccountLockedDueToMultipleAttemptsException(((CloudException.AccountLockedDueToMultipleAttemptsException) input).a());
                    } else if (cloudException.equals(CloudException.InvalidSessionException.f34456c)) {
                        input = InvalidUserSessionException.f30411b;
                    } else if (cloudException instanceof CloudException.UnknownCloudException) {
                        CloudException.UnknownCloudException unknownCloudException = (CloudException.UnknownCloudException) input;
                        iA = unknownCloudException.a();
                        if (iA != 202) {
                            input = new EmailAlreadyExistsException("");
                        } else {
                            input = new EmailAlreadyExistsException("");
                        }
                    } else if (cloudException.equals(CloudException.NotFoundException.f34457c)) {
                        input = new com.voltasit.obdeleven.domain.exceptions.HttpException.NotFound("");
                    } else if (cloudException instanceof CloudException.ParseNotFoundException) {
                        tooManySessionsException = new com.voltasit.obdeleven.domain.exceptions.HttpException.NotFound(((CloudException.ParseNotFoundException) input).getMessage());
                    } else {
                        if (cloudException instanceof CloudException.ServerException) {
                        }
                        if (input instanceof UnknownHostException) {
                            input = NoNetworkException.f30412b;
                        } else if (kotlin.jvm.internal.i.a(input.getMessage(), "read failed, socket might closed or timeout, read ret: -1")) {
                            input = new BluetoothException.ReadFromSocketException();
                        } else if (kotlin.jvm.internal.i.a(input.getMessage(), "Fair use credit limit exceeded.")) {
                            input = FairUsePolicyBreachException.f30404b;
                        }
                    }
                    input = tooManySessionsException;
                } else if (input instanceof UnknownHostException) {
                    input = NoNetworkException.f30412b;
                } else if (kotlin.jvm.internal.i.a(input.getMessage(), "read failed, socket might closed or timeout, read ret: -1")) {
                    input = new BluetoothException.ReadFromSocketException();
                } else if (kotlin.jvm.internal.i.a(input.getMessage(), "Fair use credit limit exceeded.")) {
                    input = FairUsePolicyBreachException.f30404b;
                }
            } else if (input instanceof CloudException) {
                cloudException = (CloudException) input;
                if (cloudException instanceof CloudException.AccountLockedDueToMultipleAttemptsException) {
                    tooManySessionsException = new AccountLockedDueToMultipleAttemptsException(((CloudException.AccountLockedDueToMultipleAttemptsException) input).a());
                } else if (cloudException.equals(CloudException.InvalidSessionException.f34456c)) {
                    input = InvalidUserSessionException.f30411b;
                } else if (cloudException instanceof CloudException.UnknownCloudException) {
                    CloudException.UnknownCloudException unknownCloudException2 = (CloudException.UnknownCloudException) input;
                    iA = unknownCloudException2.a();
                    if (iA != 202) {
                        input = new EmailAlreadyExistsException("");
                    } else {
                        input = new EmailAlreadyExistsException("");
                    }
                } else if (cloudException.equals(CloudException.NotFoundException.f34457c)) {
                    input = new com.voltasit.obdeleven.domain.exceptions.HttpException.NotFound("");
                } else if (cloudException instanceof CloudException.ParseNotFoundException) {
                    tooManySessionsException = new com.voltasit.obdeleven.domain.exceptions.HttpException.NotFound(((CloudException.ParseNotFoundException) input).getMessage());
                } else {
                    if (cloudException instanceof CloudException.ServerException) {
                    }
                    if (input instanceof UnknownHostException) {
                        input = NoNetworkException.f30412b;
                    } else if (kotlin.jvm.internal.i.a(input.getMessage(), "read failed, socket might closed or timeout, read ret: -1")) {
                        input = new BluetoothException.ReadFromSocketException();
                    } else if (kotlin.jvm.internal.i.a(input.getMessage(), "Fair use credit limit exceeded.")) {
                        input = FairUsePolicyBreachException.f30404b;
                    }
                }
                input = tooManySessionsException;
            } else if (input instanceof UnknownHostException) {
                input = NoNetworkException.f30412b;
            } else if (kotlin.jvm.internal.i.a(input.getMessage(), "read failed, socket might closed or timeout, read ret: -1")) {
                input = new BluetoothException.ReadFromSocketException();
            } else if (kotlin.jvm.internal.i.a(input.getMessage(), "Fair use credit limit exceeded.")) {
                input = FairUsePolicyBreachException.f30404b;
            }
        } else if (!(input instanceof ParseException)) {
            code = ((ParseException) input).getCode();
            if (code != 100) {
                input = NoNetworkException.f30412b;
            } else if (code != 203) {
                message = input.getMessage();
                if (message == null) {
                    message = "Email taken";
                }
                tooManySessionsException = new EmailAlreadyTakenException(message);
                input = tooManySessionsException;
            } else if (code != 209) {
                input = InvalidUserSessionException.f30411b;
            } else if (input instanceof CloudException) {
                cloudException = (CloudException) input;
                if (cloudException instanceof CloudException.AccountLockedDueToMultipleAttemptsException) {
                    tooManySessionsException = new AccountLockedDueToMultipleAttemptsException(((CloudException.AccountLockedDueToMultipleAttemptsException) input).a());
                } else if (cloudException.equals(CloudException.InvalidSessionException.f34456c)) {
                    input = InvalidUserSessionException.f30411b;
                } else if (cloudException instanceof CloudException.UnknownCloudException) {
                    CloudException.UnknownCloudException unknownCloudException3 = (CloudException.UnknownCloudException) input;
                    iA = unknownCloudException3.a();
                    if (iA != 202) {
                        input = new EmailAlreadyExistsException("");
                    } else {
                        input = new EmailAlreadyExistsException("");
                    }
                } else if (cloudException.equals(CloudException.NotFoundException.f34457c)) {
                    input = new com.voltasit.obdeleven.domain.exceptions.HttpException.NotFound("");
                } else if (cloudException instanceof CloudException.ParseNotFoundException) {
                    tooManySessionsException = new com.voltasit.obdeleven.domain.exceptions.HttpException.NotFound(((CloudException.ParseNotFoundException) input).getMessage());
                } else {
                    if (cloudException instanceof CloudException.ServerException) {
                    }
                    if (input instanceof UnknownHostException) {
                        input = NoNetworkException.f30412b;
                    } else if (kotlin.jvm.internal.i.a(input.getMessage(), "read failed, socket might closed or timeout, read ret: -1")) {
                        input = new BluetoothException.ReadFromSocketException();
                    } else if (kotlin.jvm.internal.i.a(input.getMessage(), "Fair use credit limit exceeded.")) {
                        input = FairUsePolicyBreachException.f30404b;
                    }
                }
                input = tooManySessionsException;
            } else if (input instanceof UnknownHostException) {
                input = NoNetworkException.f30412b;
            } else if (kotlin.jvm.internal.i.a(input.getMessage(), "read failed, socket might closed or timeout, read ret: -1")) {
                input = new BluetoothException.ReadFromSocketException();
            } else if (kotlin.jvm.internal.i.a(input.getMessage(), "Fair use credit limit exceeded.")) {
                input = FairUsePolicyBreachException.f30404b;
            }
        } else if (input instanceof CloudException) {
            cloudException = (CloudException) input;
            if (cloudException instanceof CloudException.AccountLockedDueToMultipleAttemptsException) {
                tooManySessionsException = new AccountLockedDueToMultipleAttemptsException(((CloudException.AccountLockedDueToMultipleAttemptsException) input).a());
            } else if (cloudException.equals(CloudException.InvalidSessionException.f34456c)) {
                input = InvalidUserSessionException.f30411b;
            } else if (cloudException instanceof CloudException.UnknownCloudException) {
                CloudException.UnknownCloudException unknownCloudException4 = (CloudException.UnknownCloudException) input;
                iA = unknownCloudException4.a();
                if (iA != 202 || iA == 203) {
                    input = new EmailAlreadyExistsException("");
                } else if (iA == 400) {
                    input = com.voltasit.obdeleven.domain.exceptions.HttpException.BadRequest.f30405b;
                } else if (iA == 401) {
                    input = com.voltasit.obdeleven.domain.exceptions.HttpException.Unauthorized.f30408b;
                } else if (iA != 404) {
                    this.f982a.d(unknownCloudException4, false);
                    tooManySessionsException = new com.voltasit.obdeleven.domain.exceptions.HttpException.Unknown(unknownCloudException4.a());
                } else {
                    String message7 = unknownCloudException4.getMessage();
                    tooManySessionsException = new com.voltasit.obdeleven.domain.exceptions.HttpException.NotFound(message7 != null ? message7 : "");
                }
            } else if (cloudException.equals(CloudException.NotFoundException.f34457c)) {
                input = new com.voltasit.obdeleven.domain.exceptions.HttpException.NotFound("");
            } else if (cloudException instanceof CloudException.ParseNotFoundException) {
                tooManySessionsException = new com.voltasit.obdeleven.domain.exceptions.HttpException.NotFound(((CloudException.ParseNotFoundException) input).getMessage());
            } else if ((cloudException instanceof CloudException.ServerException) && (cloudException instanceof CloudException.TooManySessionsException)) {
                tooManySessionsException = new TooManySessionsException(((CloudException.TooManySessionsException) input).a());
            } else if (input instanceof UnknownHostException) {
                input = NoNetworkException.f30412b;
            } else if (kotlin.jvm.internal.i.a(input.getMessage(), "read failed, socket might closed or timeout, read ret: -1")) {
                input = new BluetoothException.ReadFromSocketException();
            } else if (kotlin.jvm.internal.i.a(input.getMessage(), "Fair use credit limit exceeded.")) {
                input = FairUsePolicyBreachException.f30404b;
            }
            input = tooManySessionsException;
        } else if (input instanceof UnknownHostException) {
            input = NoNetworkException.f30412b;
        } else if (kotlin.jvm.internal.i.a(input.getMessage(), "read failed, socket might closed or timeout, read ret: -1")) {
            input = new BluetoothException.ReadFromSocketException();
        } else if (kotlin.jvm.internal.i.a(input.getMessage(), "Fair use credit limit exceeded.")) {
            input = FairUsePolicyBreachException.f30404b;
        }
        this.f983b.f(input);
        return input;
    }

    @Override // F8.c
    public final kotlinx.coroutines.flow.v b() {
        return this.f984c;
    }
}
