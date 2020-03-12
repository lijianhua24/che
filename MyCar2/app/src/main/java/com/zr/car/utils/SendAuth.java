package com.zr.car.utils;

import android.os.Bundle;

import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;

/**
 * 作者： 姓名
 * 日期： 2019/10/18 19:16
 */
public class SendAuth {
    private SendAuth() {
    }

    public static class Resp extends BaseResp {
        private static final String TAG = "MicroMsg.SDK.SendAuth.Resp";
        private static final int LENGTH_LIMIT = 1024;
        public String code;
        public String state;
        public String url;
        public String lang;
        public String country;

        public Resp() {
        }

        public Resp(Bundle var1) {
            this.fromBundle(var1);
        }

        public int getType() {
            return 1;
        }

        public void fromBundle(Bundle var1) {
            super.fromBundle(var1);
            this.code = var1.getString("_wxapi_sendauth_resp_token");
            this.state = var1.getString("_wxapi_sendauth_resp_state");
            this.url = var1.getString("_wxapi_sendauth_resp_url");
            this.lang = var1.getString("_wxapi_sendauth_resp_lang");
            this.country = var1.getString("_wxapi_sendauth_resp_country");
        }

        public void toBundle(Bundle var1) {
            super.toBundle(var1);
            var1.putString("_wxapi_sendauth_resp_token", this.code);
            var1.putString("_wxapi_sendauth_resp_state", this.state);
            var1.putString("_wxapi_sendauth_resp_url", this.url);
            var1.putString("_wxapi_sendauth_resp_lang", this.lang);
            var1.putString("_wxapi_sendauth_resp_country", this.country);
        }

        public boolean checkArgs() {
            if (this.state != null && this.state.length() > 1024) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static class Req extends BaseReq {
        private static final String TAG = "MicroMsg.SDK.SendAuth.Req";
        private static final int LENGTH_LIMIT = 1024;
        public String scope;
        public String state;

        public Req() {
        }

        public Req(Bundle var1) {
            this.fromBundle(var1);
        }

        public int getType() {
            return 1;
        }

        public void fromBundle(Bundle var1) {
            super.fromBundle(var1);
            this.scope = var1.getString("_wxapi_sendauth_req_scope");
            this.state = var1.getString("_wxapi_sendauth_req_state");
        }

        public void toBundle(Bundle var1) {
            super.toBundle(var1);
            var1.putString("_wxapi_sendauth_req_scope", this.scope);
            var1.putString("_wxapi_sendauth_req_state", this.state);
        }

        public boolean checkArgs() {
            if (this.scope != null && this.scope.length() != 0 && this.scope.length() <= 1024) {
                if (this.state != null && this.state.length() > 1024) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
    }
}
