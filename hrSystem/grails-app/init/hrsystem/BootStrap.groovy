package com.mlaughton

class BootStrap {

    def init = { servletContext ->

def manager1=new Manager (
fullName:'Bailey Sutton',
userName:'bsutton',
password:'bailysutton',
managerEmail:'bsutton@email.com',
office:'9100',
department:'Check-out').save()

def manager2=new Manager (
fullName:'Robbie Knight',
userName:'rknight',
password:'robbieknight',
managerEmail:'rknight@email.com',
office:'9203',
department:'Stock-room').save()

def employee1= new Employee (
fullName:'Steven Smith',
dateOfBirth: new Date('21/05/1990'),
residence:'Sheffield',
hourlyRate:'7',
employeeID:'0007',
dateEmployed: new Date('25/09/2012'),
taxCode:'TX043',
contract:'Full-Time').save()

def employee2= new Employee (
fullName:'Robert Hindley',
dateOfBirth: new Date('01/02/1995'),
residence:'Rotherham',
hourlyRate:'10',
employeeID:'0033',
dateEmployed: new Date('13/05/2017'),
taxCode:'TX152',
contract:'Part-Time').save()

def teamleader1=new TeamLeader (
fullName:'Susan Stirling',
department:'Check-out',
employeeID:'0023',
sectionName:'Bakery',
officePhone:'011102031',
leaderEmail:'sstirling@email.com',
password:'susanstirling').save()

def teamleader2=new TeamLeader (
fullName:'Bob Hunten',
department:'Clothing',
employeeID:'0246',
sectionName:'Changing-rooms',
officePhone:'011232031',
leaderEmail:'bhunten@email.com',
password:'bobhunten').save()

def task1= new Task (
taskName:'Assign-To-A-Room',
numberOfPeople:'1',
sectionName:'Changing-rooms',
department:'Clothing',
timeRequired:'10 hours',
description:'Assign shoppers to their respective changing rooms',
taskCompleted:'True').save()

def task2= new Task (
taskName:'Serve',
numberOfPeople:'2',
sectionName:'Bakery',
department:'Check-out',
timeRequired:'10 hours',
description:'Serve Customers',
taskCompleted:'True').save()

def team1= new Team (
teamName:'Clothing',
numberOfPeople:'5',
sectionName:'Changing-rooms',
description:'Changing room clothing team').save()

def team2= new Team (
teamName:'Bakery',
numberOfPeople:'3',
sectionName:'Bakery',
description:'Bakery Team').save()

def shift1=new Shift (
timeOfDay:'Morning',
dayOfWeek:'Tuesday',
numberOfHours:'10',
startingTime:'5:00am').save()

def shift2=new Shift (
timeOfDay:'Evening',
dayOfWeek:'Friday',
numberOfHours:'6',
startingTime:'6:00pm').save()

    }
    def destroy = {
    }
}
