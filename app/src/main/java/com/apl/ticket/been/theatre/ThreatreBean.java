package com.apl.ticket.been.theatre;

import java.util.List;

/**
 * Created by Administrator on 2017/3/31.
 */

public class ThreatreBean {
    private String retdesc;
    private List<TicketUnitListBean> ticketUnitList;
    private String msg;
    private String firstDate;

    public String getRetdesc() {
        return retdesc;
    }

    public List<TicketUnitListBean> getTicketUnitList() {
        return ticketUnitList;
    }

    public String getMsg() {
        return msg;
    }

    public String getFirstDate() {
        return firstDate;
    }
}
