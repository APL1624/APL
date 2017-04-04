package com.apl.ticket.been.theatre;

import java.util.List;

/**
 * Created by Administrator on 2017/3/31.
 */

public class ThreatreBean {
    private String retdesc;
    private List<TicketUnitListBean> ticketUnitList;

    private CinemaBean cinema;
    private List<MovieListBean>movieList;

    public String getRetdesc() {
        return retdesc;
    }

    public List<TicketUnitListBean> getTicketUnitList() {
        return ticketUnitList;
    }



   public CinemaBean getCinema() {
        return cinema;
    }

    public List<MovieListBean> getMovieList() {
        return movieList;
    }
}
